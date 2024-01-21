public class checkReverse {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 7, 5, 3, 1 };
        int i = 0, j = arr2.length - 1;
        while (i < arr1.length && j >= 0) {
            if (arr1[i] != arr2[j]) {
                System.out.println("Not reverse");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Reverse");
    }
}
