import java.util.*;

public class findPositionInMatrixBytakingIndexes {
    public static void main(String[] args) {

        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();

        System.out.println("Enter the row index: ");
        int i = sc.nextInt();
        System.out.println("Enter the column index: ");
        int j = sc.nextInt();

        int result = ((i * n) + (j + 1)); // i = row, j = column, n = number of columns
        System.out.println(result);

    }

}
