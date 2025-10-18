import java.util.*;
public class Strictly_Palindromic_Number {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer n: ");
        int n=scanner.nextInt();
        boolean result = solution.isStrictlyPalindromic(n);
        System.out.println("Is " + n + " strictly palindromic? " + result);
    }
}
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            String s=Integer.toString(n,i);
            String rev="";
            for(int j=s.length()-1;j>=0;j--){
                rev=rev+s.charAt(j);
            }
            if(!s.equals(rev))
            return false;
        }
        return true;
    }
}
