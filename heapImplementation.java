import java.util.Arrays;

public class heapImplementation {

    private int[] heap;
    private int size;

    public heapImplementation(int capacity) {
        this.heap = new int[capacity + 1];
        this.size = 0;
    }

    public int getParent(int i) {
        return i / 2;
    }

    public int getLeftChild(int i) {
        return 2 * i;
    }

    public int getRightChild(int i) {
        return 2 * i + 1;
    }

    public boolean isLeaf(int i) {
        return i > size / 2 && i <= size;
    }

    public void insert(int element) {
        heap[++size] = element;
        maxHeapifyUp(size);
    }

    public int extractMax() {
        int max = heap[1];
        heap[1] = heap[size--];
        maxHeapifyDown(1);
        return max;
    }

    public void maxHeapifyUp(int i) {
        while (i > 1 && heap[i] > heap[getParent(i)]) {
            swap(i, getParent(i));
            i = getParent(i);
        }
    }

    public void maxHeapifyDown(int i) {
        while (!isLeaf(i)) {
            int maxChildIndex = getLeftChild(i);
            if (getRightChild(i) <= size && heap[getRightChild(i)] > heap[maxChildIndex]) {
                maxChildIndex = getRightChild(i);
            }
            if (heap[i] >= heap[maxChildIndex]) {
                break;
            }
            swap(i, maxChildIndex);
            i = maxChildIndex;
        }
    }

    public void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void printHeap() {
        System.out.println(Arrays.toString(heap));
    }

    public static void main(String[] args) {
        heapImplementation maxHeap = new heapImplementation(10);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(2);
        maxHeap.insert(4);
        maxHeap.printHeap();
        System.out.println("Max Extracted: " + maxHeap.extractMax());
        maxHeap.printHeap();
    }
}