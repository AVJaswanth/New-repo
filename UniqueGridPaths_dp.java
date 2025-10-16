import java.util.*;

class UniqueGridPaths_dp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < cols; i++)
            arr[0][i] = 1;
        for (int i = 0; i < rows; i++)
            arr[i][0] = 1;

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }

        System.out.print(arr[rows - 1][cols - 1]);
    }
}
