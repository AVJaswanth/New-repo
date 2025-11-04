import java.util.Scanner;

public class PivotFinder {
    public static int pivotInteger(int n) {
        int sum = (n * (n + 1)) / 2;
        for (int i = 1; i <= n; i++) {
            if ((i * (i + 1)) / 2 == sum - (((i - 1) * i) / 2))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();
        int result = pivotInteger(n);
        System.out.println("The pivot integer is: " + result);
    }
}
