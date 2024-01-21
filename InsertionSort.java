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
