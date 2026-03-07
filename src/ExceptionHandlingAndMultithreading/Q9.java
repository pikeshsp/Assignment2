package ExceptionHandlingAndMultithreading;

class LifeCycleDemo extends Thread {

    public void run() {
        System.out.println("Thread is running");
        try {
            Thread.sleep(1000); // thread goes to waiting state
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread execution finished");
    }
}
public class Q9 {
    public static void main(String[] args) {
        LifeCycleDemo t = new LifeCycleDemo();

        System.out.println("Thread state after creation: " + t.getState());

        t.start();
        System.out.println("Thread state after start(): " + t.getState());
    }
}

