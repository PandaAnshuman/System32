/**
 * stackUsingArray
 */
public class stackUsingArray {

    int[] arr;
    int top;

    stackUsingArray(int size) {
        arr = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = data;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return;
        }
        top--;
    }

    void traversal() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        stackUsingArray stack = new stackUsingArray(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.traversal();
        stack.pop();
        stack.pop();
        stack.traversal();
    }
}