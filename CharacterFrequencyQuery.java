import java.util.*;
class CharacterFrequencyQuery {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    int ql = sc.nextInt();
    for (int i = 0; i < ql; i++) {
      int q = sc.nextInt();
      Character tar = s.charAt(q - 1);
      int count = 0;
      for (int j = q - 2; j >= 0; j--) {
        if (tar.equals(s.charAt(j))) count++;
      }
      System.out.println(count);
    }
  }
}
