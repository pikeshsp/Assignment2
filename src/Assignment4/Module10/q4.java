package Assignment4.Module10;

import java.util.Stack;
import java.util.Scanner;

public class q4{

    static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            // Check closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) return false;

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String str = sc.nextLine();

        if (isBalanced(str)) {
            System.out.println("Balanced Parentheses");
        } else {
            System.out.println("Not Balanced");
        }

        sc.close();
    }
}
