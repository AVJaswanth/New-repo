import java.util.*;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix (n): ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element at position (" + i + "," + j + "): ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        if (mat.length == 1)
            return mat[0][0];
        int sum = 0;
        if (mat.length % 2 == 0) {
            for (int i = 0; i < mat.length; i++) {
                sum += mat[i][i];
                sum += mat[i][mat.length - 1 - i];
            }
            return sum;
        }
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[i][mat.length - 1 - i];
        }
        return sum - mat[mat.length / 2][mat.length / 2];
    }
}
