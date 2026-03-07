package ExceptionHandlingAndMultithreading;

class Counter {
    int count = 0;
    synchronized void increment() {
        count++;
    }
}
class MyThread11 extends Thread {
    Counter c;
    MyThread11(Counter c) {
        this.c = c;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}
public class Q8 {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        MyThread11 t1 = new MyThread11(c);
        MyThread11 t2 = new MyThread11(c);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Counter Value: " + c.count);
    }
}
