import java.util.*;

class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        ArrayList<Character> ans = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                ArrayList<Character> n = new ArrayList<>();
                ArrayList<Character> nr = new ArrayList<>();

                for (int k = i; k <= j; k++) {
                    n.add(s.charAt(k));
                }
                for (int k = j; k >= i; k--) {
                    nr.add(s.charAt(k));
                }

                boolean is = true;
                for (int k = 0; k < n.size(); k++) {
                    if (n.get(k) != nr.get(k)) {
                        is = false;
                        break;
                    }
                }

                if (is && n.size() > max) {
                    max = n.size();
                    ans.clear();
                    ans.addAll(n);
                }
            }
        }

        for (char c : ans) {
            System.out.print(c);
        }
    }
}
