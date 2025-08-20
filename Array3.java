import java.util.*;
class Array3 {
    public static void main(String args[]) {
        int i, j;
        int row, cols;
        Scanner sc = new Scanner(System.in);

        // input rows and columns
        System.out.print("Enter number of rows: ");
        row = sc.nextInt();
        System.out.print("Enter number of cols: ");
        cols = sc.nextInt();

        int[][] a = new int[row][cols];

        // input matrix
        System.out.println("Enter matrix elements:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // find maximum of each row
        System.out.println("Largest element of each row:");
        for (i = 0; i < row; i++) {
            int max = a[i][0];  // first element of the row
            for (j = 1; j < cols; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            System.out.println("Row " + (i + 1) + " max = " + max);
        }
    }
}
