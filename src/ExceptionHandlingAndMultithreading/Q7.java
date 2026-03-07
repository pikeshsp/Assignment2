package ExceptionHandlingAndMultithreading;

class MyRunnable implements Runnable {

    // Implement run() method
    public void run() {
        System.out.println("Thread is running using Runnable interface");
    }
}
public class Q7 {
    public static void main(String[] args) {

        // Creating object of Runnable class
        MyRunnable obj = new MyRunnable();

        // Creating thread object
        Thread t1 = new Thread(obj);

        // Starting thread
        t1.start();
    }
}
