import java.util.Scanner;

public class AsteriskCounter {
    public static int countAsterisks(String s) {
        int count = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|')
                c++;
            if (c % 2 == 0) {
                if (s.charAt(i) == '*')
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        int result = countAsterisks(s);
        System.out.println("The number of asterisks is: " + result);
    }
}
