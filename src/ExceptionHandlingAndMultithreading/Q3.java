package ExceptionHandlingAndMultithreading;

public class Q3 {
    public static void main(String[] args) {
            int age = 16;

            try {
                if (age < 18) {
                    throw new ArithmeticException("Age is less than 18. Not eligible.");
                }
                else {
                    System.out.println("Eligible to vote.");
                }
            }
            catch (ArithmeticException e) {
                System.out.println("Exception: " + e.getMessage());
            }

        }
    }
