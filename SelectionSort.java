public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        for (int i = 0; i < arr.length; i++) {
            int min = i; // set the minimum element to the current element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) { // if the current element is less than the minimum element
                    min = j; // set the minimum element to the current element
                }
            }
            int temp = arr[i]; // swap the minimum element with the current element
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

// public class SelectionSortRecursive {
// static void selectionSortRecursive(int arr[], int n) {
// if (n == 1)
// return;

// int minIndex = findMinIndex(arr, n);
// swap(arr, minIndex, n-1);

// selectionSortRecursive(arr, n-1);
// }

// static int findMinIndex(int arr[], int n) {
// int minIndex = 0;
// for (int i = 1; i < n; i++)
// if (arr[i] < arr[minIndex])
// minIndex = i;
// return minIndex;
// }

// static void swap(int arr[], int i, int j) {
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;
// }

// public static void main(String args[]) {
// int arr[] = {64, 25, 12, 22, 11, 90};
// int n = arr.length;
// selectionSortRecursive(arr, n);
// System.out.println("Sorted array:");
// for (int i=0; i<n; ++i)
// System.out.print(arr[i] + " ");
// System.out.println();
// }
// }