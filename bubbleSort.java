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
