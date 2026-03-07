package Module9;

import java.util.Scanner;

public class Q3 {
    static int fibonacci(int n) {
        if (n == 0)
            return 0;      // base case
        else if (n == 1)
            return 1;      // base case
        else
            return fibonacci(n - 1) + fibonacci(n - 2);   // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
