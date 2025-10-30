import java.util.*;

public class PowerfulIntegersCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for x: ");
        int x = sc.nextInt();
        System.out.print("Enter value for y: ");
        int y = sc.nextInt();
        System.out.print("Enter value for bound: ");
        int bound = sc.nextInt();
        Solution s = new Solution();
        List<Integer> result = s.powerfulIntegers(x, y, bound);
        System.out.println("Powerful Integers: " + result);
    }
}

class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        ArrayList<Integer> l = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        if (x != 1) {
            while (true) {
                if ((int) Math.pow(x, p1 + 1) >= bound) {
                    break;
                }
                p1++;
            }
        }
        if (y != 1) {
            while (true) {
                if ((int) Math.pow(y, p2 + 1) >= bound) {
                    break;
                }
                p2++;
            }
        }
        for (int i = 0; i <= p1; i++) {
            for (int j = 0; j <= p2; j++) {
                int val = (int) Math.pow(x, i) + (int) Math.pow(y, j);
                if (val <= bound && !l.contains(val)) {
                    l.add(val);
                }
            }
        }
        return l;
    }
}
