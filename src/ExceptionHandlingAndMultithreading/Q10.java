package ExceptionHandlingAndMultithreading;

class number {
int number = 1;
int limit = 10;

synchronized void printOdd() {
    while (number <= limit) {
        if (number % 2 == 0) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        System.out.println("Odd: " + number);
        number++;
        notify();
    }
}

synchronized void printEven() {
    while (number <= limit) {
        if (number % 2 == 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        System.out.println("Even: " + number);
        number++;
        notify();
    }
}
}
public class Q10 {
    public static void main(String[] args) {
        number np = new number();

        Thread t1 = new Thread(() -> np.printOdd());
        Thread t2 = new Thread(() -> np.printEven());

        t1.start();
        t2.start();
    }
}
