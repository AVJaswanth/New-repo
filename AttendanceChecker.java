import java.util.Scanner;

public class AttendanceChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the attendance record string:");
        String s = sc.nextLine();
        System.out.println(checkRecord(s));
    }

    public static boolean checkRecord(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                count++;
            }
            if (count >= 2) return false;
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L')
                return false;
        }
        return true;
    }
}
