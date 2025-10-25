import java.util.*;
public class Binary_Strings_Without_Consecutive_0s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string length: ");
        int n = sc.nextInt(); 
        List<String> result = validStrings(n);
        System.out.println("Strings without consecutive 0s: " + result); 
    }
    public static List<String> validStrings(int n) {
        ArrayList <String> tot=new ArrayList <>();
        ArrayList <String> ans=new ArrayList <>();
        for(int i=0;i<(int)Math.pow(2,n);i++){
            if(Integer.toBinaryString(i).length()==n)
            tot.add(Integer.toBinaryString(i));
            else{
            String str=Integer.toBinaryString(i);
                String rem="";
                for(int j=0;j<n-Integer.toBinaryString(i).length();j++){
                    rem=rem+"0";
                }
                str=rem+str;
                tot.add(str);
            }
        }
        for(int i=0;i<tot.size();i++){
            boolean is=true;
            for(int j=0;j<tot.get(i).length()-1;j++){
                if(tot.get(i).charAt(j)=='0' && tot.get(i).charAt(j+1)=='0'){
                    is=false;
                    break;
                }
            }
            if(is)
            ans.add(tot.get(i));
        }
        return ans;
    }
}