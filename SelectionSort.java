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
