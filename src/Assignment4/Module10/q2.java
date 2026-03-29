package Assignment4.Module10;

class Queue {
    int front, rear, maxSize;
    int[] queue;


    Queue(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
    }


    void addqueue(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue Overflow");
        } else {
            queue[++rear] = value;
            System.out.println(value + " inserted into queue");
        }
    }

    void deletequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front++] + " removed from queue");
        }
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

public class q2 {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.addqueue(10);
        q.addqueue(20);
        q.addqueue(30);
        q.display();

        q.deletequeue();
        q.display();
    }
}