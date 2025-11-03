import java.util.*;

public class SnakeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix (n) and number of commands (m): ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<String> commands = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            System.out.print("Enter command " + (i + 1) + ": ");
            commands.add(sc.next());
        }
        System.out.println(finalPositionOfSnake(n, commands));
    }

    public static int finalPositionOfSnake(int n, List<String> commands) {
        int[][] arr = new int[n][n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = count;
                count++;
            }
        }
        int row = 0;
        int col = 0;
        for (int i = 0; i < commands.size(); i++) {
            if (commands.get(i).equals("RIGHT"))
                col++;
            else if (commands.get(i).equals("DOWN"))
                row++;
            else if (commands.get(i).equals("UP"))
                row--;
            else
                col--;
        }
        return arr[row][col];
    }
}
