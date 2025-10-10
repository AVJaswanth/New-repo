import java.util.*;

public class PalindromeStructureChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean palin = true;

        if (s.length() % 2 == 0) {
            ArrayList<Character> l = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (!l.contains(s.charAt(i))) {
                    l.add(s.charAt(i));
                }
            }
            if (!(s.length() / 2 == l.size())) {
                palin = false;
            }
        } else {
            ArrayList<Character> l = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (!l.contains(s.charAt(i))) {
                    l.add(s.charAt(i));
                }
            }
            if (!((int) (s.length() / 2) + 1 == l.size())) {
                palin = false;
            }
        }

        if (palin) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
