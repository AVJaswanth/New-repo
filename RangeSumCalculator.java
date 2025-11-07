import java.util.Scanner;

class RangeSumCalculator {
    int[] arr;
    public RangeSumCalculator(int[] nums) {
        arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            arr[i] = nums[i];
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++)
            sum += arr[i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        System.out.print("Enter left index: ");
        int left = sc.nextInt();
        System.out.print("Enter right index: ");
        int right = sc.nextInt();
        RangeSumCalculator obj = new RangeSumCalculator(nums);
        System.out.println("Sum of range: " + obj.sumRange(left, right));
    }
}
