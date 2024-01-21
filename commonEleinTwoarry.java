import java.util.Arrays;

public class commonEleinTwoarry {
    public static int[] findCommonElements(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            int num = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                if (num == arr2[j]) {
                    result[index] = num;
                    index++;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 2, 3, 4, 5, 6, 7 };
        int[] result = findCommonElements(arr1, arr2);
        System.out.println("The common elements are: " + Arrays.toString(result));
    }
}
