package ExceptionHandlingAndMultithreading;

class MyThread extends Thread {

    // Overriding run() method
    public void run() {
        System.out.println("Thread is running");
    }
}
public class Q6 {
    public static void main(String[] args) {

        // Creating thread object
        MyThread t1 = new MyThread();

        // Starting the thread
        t1.start();
    }
}

