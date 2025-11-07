import java.util.*;

class RankTransformer {
    public int[] arrayRankTransform(int[] arr) {
        int[] ans = new int[arr.length];
        int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sorted[i] = arr[i];
        }
        Arrays.sort(sorted);
        Map<Integer, Integer> rankmap = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < sorted.length; i++) {
            if (!rankmap.containsKey(sorted[i])) {
                rankmap.put(sorted[i], rank++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            ans[i] = rankmap.get(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        RankTransformer rt = new RankTransformer();
        int[] result = rt.arrayRankTransform(arr);
        for (int val : result)
            System.out.print(val + " ");
    }
}
