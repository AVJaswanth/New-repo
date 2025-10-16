import java.util.*;
class RobotStaircaseClimb_dp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int n = sc.nextInt();

        if (n <= 3) {
            System.out.print(n);
        } else {
            int[] arr = new int[n];
            arr[0] = 1;
            arr[1] = 2;
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.print(arr[n - 1]);
        }
    }
}
