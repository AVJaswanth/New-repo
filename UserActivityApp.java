import java.util.*;

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] ans = new int[k];
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        for (int i = 0; i < logs.length; i++) {
            int user = logs[i][0];
            int minute = logs[i][1];
            map.computeIfAbsent(user, x -> new HashSet<>()).add(minute);
        }

        for (Map.Entry<Integer, HashSet<Integer>> entry : map.entrySet()) {
            int activeMinutes = entry.getValue().size();
            if (activeMinutes <= k) {
                ans[activeMinutes - 1]++;
            }
        }

        return ans;
    }
}

public class UserActivityApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of log entries: ");
        int n = sc.nextInt();

        int[][] logs = new int[n][2];
        System.out.println("Enter log entries (userId minute):");
        for (int i = 0; i < n; i++) {
            logs[i][0] = sc.nextInt();
            logs[i][1] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        Solution sol = new Solution();
        int[] result = sol.findingUsersActiveMinutes(logs, k);

        System.out.println("Users Active Minutes:");
        for (int i = 0; i < result.length; i++) {
            System.out.println((i + 1) + " minute(s): " + result[i] + " user(s)");
        }

        sc.close();
    }
}
