package ExceptionHandlingAndMultithreading;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}
public class Q4 {
    public static void main(String[] args) {
        int number = -5;

        try {
            if (number < 0) {
                throw new MyException("Number cannot be negative");
            }
            else {
                System.out.println("Number is: " + number);
            }
        }
        catch (MyException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}

