import java.util.*;

class KthMissingNumberFinder {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
            l.add(arr[i]);
        int count = 0;
        int i = 1;
        while (true) {
            if (!l.contains(i)) {
                count++;
            }
            if (count == k)
                return i;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        KthMissingNumberFinder finder = new KthMissingNumberFinder();
        System.out.println("The " + k + "th missing positive integer is: " +   finder.findKthPositive(arr, k));
    }
}
