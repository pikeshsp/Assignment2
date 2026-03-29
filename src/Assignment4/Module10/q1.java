package Assignment4.Module10;

import java.util.Scanner;
class Stack {
    int maxSize;
    int[] stack;
    int top;
    Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }
    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top--] + " popped from stack");
        }
    }
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();

        s.pop();
        s.peek();
        s.display();

        sc.close();
    }
}
