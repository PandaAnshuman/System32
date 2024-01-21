import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static int[] removeDuplicates(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (i == 0) {
                result[index] = num;
                index++;
            } else {
                if (num != arr[i - 1]) {
                    result[index] = num;
                    index++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 6, 6 };
        int[] result = removeDuplicates(arr);
        System.out.println("The array after removing duplicates is: " + Arrays.toString(result));
    }
}
