package AdvancedJavaConcepts;

import java.util.Scanner;

public class Q3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the String : ");
        String str = sc.nextLine();
        String str1 = "Hello";
        System.out.println(" concated string : " +str1.concat(str));
        System.out.println(" unaltered original string : "+str);

    }
}
