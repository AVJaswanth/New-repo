import java.util.*;
public class Simplified_Fractions{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt(); 
        List<String> result = simplifiedFractions(n);
        System.out.println("The result is: " + result); 
    }

    public static List<String> simplifiedFractions(int n) {
        ArrayList <String> ans=new ArrayList <>();
        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                int hcf=1;
                int min=Math.min(j,i);
                for(int k=min;k>=1;k--){
                    if(i%k==0 && j%k==0){
                    hcf=k;
                    break;
                }
                }
                if(hcf==1){
                    String str=Integer.toString(j)+"/"+Integer.toString(i);
                    ans.add(str);
                }
            }
        }
        return ans;
    }
}

