package Module9;

import java.util.Scanner;

public class Q1 {
    static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);   // recursive call
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printNumbers(n);
    }
}
