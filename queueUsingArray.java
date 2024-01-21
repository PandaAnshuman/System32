import java.util.Arrays;

public class queueUsingArray {
    int[] queue = new int[5];
    int front = -1;
    int rear = -1;

    public static void main(String[] args) {
        queueUsingArray queue = new queueUsingArray();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Deleted element: " + queue.dequeue()); //
        queue.printQueue(); // Queue: 2 3 4 5

    }

    void enqueue(int data) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            front++;
        }
        queue[++rear] = data;
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return data;
    }

    void printQueue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
