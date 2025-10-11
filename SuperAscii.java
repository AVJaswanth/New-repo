import java.util.*;
class SuperAscii {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Character> l = new ArrayList<>();
    for (int i = 97; i <= 122; i++)
      l.add((char) i);
    l.add(0, '0');
    int len = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < len; i++) {
      HashMap<Character, Integer> map = new HashMap<>();
      String s = sc.nextLine();
      for (int j = 0; j < s.length(); j++) {
        if (!map.containsKey(s.charAt(j))) {
          map.put(s.charAt(j), 1);
        } else {
          map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
        }
      }
      boolean is = true;
      for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() != l.indexOf(entry.getKey())) {
          System.out.println("NO");
          is = false;
          break;
        }
      }
      if (is)
        System.out.println("YES");
    }
  }
}
