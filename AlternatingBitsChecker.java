import java.util.*;

class AlternatingBitsChecker {
    public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for alternating bits:");
        int n = sc.nextInt();
        AlternatingBitsChecker checker = new AlternatingBitsChecker();
        System.out.println(checker.hasAlternatingBits(n));
    }
}
