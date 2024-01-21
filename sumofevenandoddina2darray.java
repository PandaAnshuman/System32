public class sumofevenandoddina2darray {
    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

        for (int i = 0; i < arr.length; i++) {
            int evensum = 0;
            int oddsum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    evensum += arr[i][j];
                } else {
                    oddsum += arr[i][j];
                }
            }
            System.out.print("Even Sum of row " + i + " is " + evensum + " ");
            System.out.print("Odd Sum of row " + i + " is " + oddsum + " ");
            System.out.println();
        }

    }
}
