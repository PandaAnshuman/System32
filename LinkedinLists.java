public class LinkedinLists {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.create(1);
        list.create(2);
        list.create(3);
        list.create(4);
        list.insertionAtanyPosition(2, 5);
        list.deleteAtAnyPosition(1);
        list.traversal();
        list.reverse();
        list.traversal();
    }

    static class LinkedList {
        Node head;

        void create(int data) {
            Node node = new Node(data);
            if (head == null) {
                head = node;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }

        void reverse() {
            Node current = head;
            Node prev = null;
            Node next = null;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;

            }
            head = prev;
        }

        void deleteAtAnyPosition(int position) {
            Node current = head;
            Node prev = null;
            int count = 0;
            while (current != null) {
                if (count == position) {
                    prev.next = current.next;
                    break;
                }
                prev = current;
                current = current.next;
                count++;
            }
        }

        void insertionAtanyPosition(int position, int data) {
            Node node = new Node(data);
            Node current = head;
            Node prev = null;
            int count = 0;
            while (current != null) {
                if (count == position) {
                    prev.next = node;
                    node.next = current;
                    break;
                }
                prev = current;
                current = current.next;
                count++;
            }
        }

        void traversal() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
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
