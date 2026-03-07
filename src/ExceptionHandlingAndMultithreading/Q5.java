package ExceptionHandlingAndMultithreading;

public class Q5 {

        // Method declaring exception using throws
        static void divide(int a, int b) throws ArithmeticException {
            int result = a / b;
            System.out.println("Result: " + result);
        }

        public static void main(String[] args) {

            try {
                divide(10, 0);  // Calling method
            }
            catch (ArithmeticException e) {
                System.out.println("Exception caught: Division by zero");
            }

        }
    }
