import java.util.*;
class NumberToRoman {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    ArrayList<String> l = new ArrayList<>();
    int count = 0;
    while (num > 0) {
      int rem = num % 10;
      count++;
      if (count == 1) {
        if (rem == 1) l.add("I");
        else if (rem == 2) l.add("II");
        else if (rem == 3) l.add("III");
        else if (rem == 4) l.add("IV");
        else if (rem == 5) l.add("V");
        else if (rem == 6) l.add("VI");
        else if (rem == 7) l.add("VII");
        else if (rem == 8) l.add("VIII");
        else if (rem == 9) l.add("IX");
      } else if (count == 2) {
        if (rem == 1) l.add("X");
        else if (rem == 2) l.add("XX");
        else if (rem == 3) l.add("XXX");
        else if (rem == 4) l.add("XL");
        else if (rem == 5) l.add("L");
        else if (rem == 6) l.add("LX");
        else if (rem == 7) l.add("LXX");
        else if (rem == 8) l.add("LXXX");
        else if (rem == 9) l.add("XC");
      } else if (count == 3) {
        if (rem == 1) l.add("C");
        else if (rem == 2) l.add("CC");
        else if (rem == 3) l.add("CCC");
        else if (rem == 4) l.add("CD");
        else if (rem == 5) l.add("D");
        else if (rem == 6) l.add("DC");
        else if (rem == 7) l.add("DCC");
        else if (rem == 8) l.add("DCCC");
        else if (rem == 9) l.add("CM");
      } else if (count == 4) {
        if (rem == 1) l.add("M");
        else if (rem == 2) l.add("MM");
        else if (rem == 3) l.add("MMM");
      }
      num /= 10;
    }
    Collections.reverse(l);
    String s = "";
    for (int i = 0; i < l.size(); i++) {
      s = s + l.get(i);
    }
    System.out.print(s);
  }
}
