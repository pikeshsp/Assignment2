package Assignment4.Module10;

import java.util.Stack;

public class q3 {
    static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int temp = st.pop();
        insertAtBottom(st, x);
        st.push(temp);
    }
    static void reverse(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int x = st.pop();
            reverse(st);
            insertAtBottom(st, x);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Original Stack: " + st);

        reverse(st);

        System.out.println("Reversed Stack: " + st);
    }
}