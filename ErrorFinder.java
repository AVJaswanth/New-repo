import java.util.*;

public class ErrorFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = findErrorNums(nums);
        System.out.println("Duplicate number: " + result[0]);
        System.out.println("Missing number: " + result[1]);
    }

    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else {
                map.put(nums[i], map.get(nums[i]) + 1);
                arr[0] = nums[i];
            }
        }
        for(int i = 1; i <= max; i++) {
            if(!map.containsKey(i)) {
                arr[1] = i;
                return arr;
            }
        }
        arr[1] = max + 1;
        return arr;
    }
}
