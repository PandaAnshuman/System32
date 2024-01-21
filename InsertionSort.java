public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i]; // current element
            int j = i - 1; // previous element

            while (j >= 0 && arr[j] > current) { // if the previous element is greater than the current element
                arr[j + 1] = arr[j]; // shift the previous element to the right
                j--;
            }
            arr[j + 1] = current; // insert the current element in the correct position
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

// public class InsertionSortursive {
// static void insertionSortRecurs(int arr[], int n) {
// if (n <= 1)
// return;

// insertionSortRecurs(arr, n-1);
// insert(arr, n-1
// }

// static void insert(int arr[], int position) {
// int key = arr[position];
// int i = position - 1;

// while (i >= 0 && arr[i] > key) {
// arr[i+1] = arr[i];
// i--;
// }
// arr[i+1] = key;
// }

// public static void main(String args[]) {
// int arr[] = {12, 11, 13, 5, 6};
// int n = arr.length;
// insertionSortRecursive(arr, n);
// System.out.println("Sorted array:");
// for (int i=0; i<n; ++i)
// System.out.print(arr[i] + " ");
// System.out.println();
// }
// }