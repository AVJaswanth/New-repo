import java.util.*;
public class Next_Beautiful_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = nextBeautifulNumber(n);
        System.out.println("The next beautiful number is: " + result); 
    }
    public static int nextBeautifulNumber(int n) {
        for(int i=n+1;i<=Integer.MAX_VALUE;i++){
            int num=i;
            HashMap<Integer,Integer> map=new HashMap<>();
            while(num>0){
                int dig=num%10;
                if(!map.containsKey(dig))
                map.put(dig,1);
                else
                map.put(dig,map.get(dig)+1);
                num/=10;
            }
            boolean is=true;
            for (Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getKey()!=entry.getValue()){
                    is=false;
                    break;
                }
            }
            if(is)
            return i;
        }
        return Integer.MAX_VALUE;
    }
}