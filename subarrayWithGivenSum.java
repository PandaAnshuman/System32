/**
 * subarrayWithGivenSum
 */
public class subarrayWithGivenSum {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 5 };
        int sum = 12;
        int currentSum = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            while (currentSum > sum) {
                currentSum -= arr[start++];
            }
            if (currentSum == sum) {
                System.out.println(start + " " + i);
                return;
            }
        }
        System.out.println("Not found");
    }
}