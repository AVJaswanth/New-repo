import java.util.*;

class SmartThiefLootMaximizer_dp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of houses: ");   
        int len = sc.nextInt();
        int[] arr = new int[len];

        System.out.print("Enter the amount of loot in each house: ");
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();

        if (len == 0)
            System.out.print(0);
        else if (len == 1)
            System.out.print(arr[0]);
        else {
            int[] dp = new int[len];
            dp[0] = arr[0];
            dp[1] = Math.max(arr[0], arr[1]);
            for (int i = 2; i < len; i++) {
                dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
            }
            System.out.print(dp[len - 1]);
        }
    }
}
