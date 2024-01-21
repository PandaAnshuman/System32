public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) { // if the previous element is greater than the current element
                    int temp = arr[j - 1]; // swap the elements
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) { // if no swapping is done, then the array is already sorted
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// public class BubbleSortRecursive {
// static void bubbleSortRecursive(int arr[], int n) {
// if (n == 1)
// return;

// for (int i = 0; i < n-1; i++)
// if (arr[i] > arr[i+1]) {
// // swap arr[i] and arr[i+1]
// int temp = arr[i];
// arr[i] = arr[i+1];
// arr[i+1] = temp;
// }

// bubbleSortRecursive(arr, n-1);
// }

// public static void main(String args[]) {
// int arr[] = {64, 34, 25, 12, 22, 11, 90};
// int n = arr.length;
// bubbleSortRecursive(arr, n);
// System.out.println("Sorted array:");
// for (int i=0; i<n; ++i)
// System.out.print(arr[i] + " ");
// System.out.println();
// }
// }