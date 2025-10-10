import java.util.*;

class LongestNonRepeatingSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            ArrayList<Character> l = new ArrayList<>();
            for (int j = i; j < s.length(); j++) {
                if (!l.contains(s.charAt(j))) {
                    l.add(s.charAt(j));
                } else {
                    break;
                }
            }
            if (l.size() > length) {
                length = l.size();
            }
        }

        System.out.print(length);
    }
}
