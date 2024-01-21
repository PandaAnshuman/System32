import java.util.Arrays;

public class smallestPositiveNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 3, 4, 5, 6, 7 };
        int result = findSmallestPositiveMissingNumber(arr);
        System.out.println("The smallest positive missing number is: " + result);
    }

    public static int findSmallestPositiveMissingNumber(int[] arr) {
        Arrays.sort(arr);

        int smallestMissingNumber = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallestMissingNumber) {
                smallestMissingNumber++;
            }
        }

        return smallestMissingNumber;
    }
}
