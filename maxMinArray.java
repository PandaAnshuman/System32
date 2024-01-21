import java.util.*;

public class maxMinArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr2 = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < arr2.length; i = i + 2) {
            arr2[i] = arr[j--];
        }
        System.out.println(Arrays.toString(arr2));
        j = 0;
        for (int i = 1; i < arr2.length; i = i + 2) {
            arr2[i] = arr[j++];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
