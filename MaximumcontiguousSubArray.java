public class MaximumcontiguousSubArray {

    public static void main(String[] args) {
        int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Maximum contiguous subarray sum is: " + maxSubArraySum(array));
    }

    public static int maxSubArraySum(int[] array) {
        int size = array.length;
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;

        for (int i = 0; i < size; i++) {
            maxEndingHere = maxEndingHere + array[i];
            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
            if (maxEndingHere < 0)
                maxEndingHere = 0;
        }
        return maxSoFar;
    }
}