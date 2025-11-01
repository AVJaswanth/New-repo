import java.util.*;

public class HourglassSumCalculator {
    static class Solution {
        public int maxSum(int[][] grid) {
            int max = 0;
            for (int i = 0; i < grid.length - 2; i++) {
                for (int j = 0; j < grid[0].length - 2; j++) {
                    int sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2]
                            + grid[i + 1][j + 1]
                            + grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];
                    if (sum > max)
                        max = sum;
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] grid = new int[rows][cols];
        System.out.println("Enter grid values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        Solution sol = new Solution();
        int result = sol.maxSum(grid);
        System.out.println("Maximum hourglass sum: " + result);
        sc.close();
    }
}
