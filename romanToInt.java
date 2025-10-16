import java.util.*;
class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int i = s.length() - 1;

        while (i >= 0) {
            if (i > 0 && s.charAt(i - 1) == 'C' && s.charAt(i) == 'M') {
                sum += 900;
                i -= 2; 
            } else if (i > 0 && s.charAt(i - 1) == 'C' && s.charAt(i) == 'D') {
                sum += 400;
                i -= 2;
            } else if (i > 0 && s.charAt(i - 1) == 'X' && s.charAt(i) == 'C') {
                sum += 90;
                i -= 2;
            } else if (i > 0 && s.charAt(i - 1) == 'X' && s.charAt(i) == 'L') {
                sum += 40;
                i -= 2;
            } else if (i > 0 && s.charAt(i - 1) == 'I' && s.charAt(i) == 'X') {
                sum += 9;
                i -= 2;
            } else if (i > 0 && s.charAt(i - 1) == 'I' && s.charAt(i) == 'V') {
                sum += 4;
                i -= 2;
            } else {
                if (s.charAt(i) == 'I') sum += 1;
                else if (s.charAt(i) == 'V') sum += 5;
                else if (s.charAt(i) == 'X') sum += 10;
                else if (s.charAt(i) == 'L') sum += 50;
                else if (s.charAt(i) == 'C') sum += 100;
                else if (s.charAt(i) == 'D') sum += 500;
                else if (s.charAt(i) == 'M') sum += 1000;
                i--; 
            }
        }

        return sum;
    }
}
class romanToInt{
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine(); 
        int result = solution.romanToInt(romanNumeral);
        System.out.println("The integer value of the Roman numeral " + romanNumeral + " is: " + result);
    }
}