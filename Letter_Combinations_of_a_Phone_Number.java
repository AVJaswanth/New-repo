
import java.util.*;
class Letter_Combinations_of_a_Phone_Number{
    public static void main(String[] args) {
        Solution sol=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter digits: ");
        String digits=sc.nextLine();
        List<String> result=sol.letterCombinations(digits);
        System.out.println("Result: " + result);
    }
}
class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) return ans;
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        if(digits.length()==1){
            for(int i=0;i<map.get(digits.charAt(0)).length();i++){
                String a="";
                a=a+map.get(digits.charAt(0)).charAt(i);
                ans.add(a);
            }
        }
        else if(digits.length()==2){
            for(int i=0;i<map.get(digits.charAt(0)).length();i++){
                for(int j=0;j<map.get(digits.charAt(1)).length();j++){
                    String a="";
                    a=a+map.get(digits.charAt(0)).charAt(i)+map.get(digits.charAt(1)).charAt(j);
                    ans.add(a);
                }
            }
        }
        else if(digits.length()==3){
            for(int i=0;i<map.get(digits.charAt(0)).length();i++){
                for(int j=0;j<map.get(digits.charAt(1)).length();j++){
                    for(int k=0;k<map.get(digits.charAt(2)).length();k++){
                        String a="";
                        a=a+map.get(digits.charAt(0)).charAt(i)+map.get(digits.charAt(1)).charAt(j)+map.get(digits.charAt(2)).charAt(k);
                        ans.add(a);
                    }
                }
            }
        }
        else{
            for(int i=0;i<map.get(digits.charAt(0)).length();i++){
                for(int j=0;j<map.get(digits.charAt(1)).length();j++){
                    for(int k=0;k<map.get(digits.charAt(2)).length();k++){
                        for(int z=0;z<map.get(digits.charAt(3)).length();z++){
                            String a="";
                            a=a+map.get(digits.charAt(0)).charAt(i)+map.get(digits.charAt(1)).charAt(j)+map.get(digits.charAt(2)).charAt(k)+map.get(digits.charAt(3)).charAt(z);
                            ans.add(a); 
                        }
                    }
                }
            }
        }
        return ans;
    }
}
