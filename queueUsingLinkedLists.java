public class queueUsingLinkedLists {
    Node head;
    Node tail;

    void enqueue(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    void dequeue() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }
        head = head.next;
    }

    void traversal() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
