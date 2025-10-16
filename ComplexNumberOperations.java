import java.util.*;
public class ComplexNumberOperations {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the real and imaginary parts of first complex number: ");
        int r1=sc.nextInt();
        int i1=sc.nextInt();
        System.out.println("Enter the real and imaginary parts of second complex number: ");
        int r2=sc.nextInt();
        int i2=sc.nextInt();
        System.out.println("Enter the operation to be performed (+, -, *, /): ");
        String s=sc.next();
        if(s.equals("+")){
            int rsum=r1+r2;
            int isum=i1+i2;
            if(isum>=0){
                System.out.println(rsum+" + "+isum+"i");
            }
            else{
                System.out.println(rsum+" - "+(int)Math.abs(isum)+"i");
            }
        }
        else if(s.equals("-")){
            int rsub=r1-r2;
            int isub=i1-i2;
            if(isub>=0){
                System.out.println(rsub+" + "+isub+"i");
            }
            else{
                System.out.println(rsub+" - "+(int)Math.abs(isub)+"i");
            }
            
        }
        else if(s.equals("*")){
            int dig1=r1*r2;
            int dig2=r1*i2;
            int dig3=i1*r2;
            int dig4=i1*i2;
            if(dig4>=0) dig4=dig4*(-1);
            else dig4=dig4;
            int ansr=dig1+dig4;
            int ansi=dig2+dig3;
            if(ansi>=0){
                System.out.println(ansr+" + "+ansi+"i");
            }
            else{
                System.out.println(ansr+" - "+(int)Math.abs(ansi)+"i");
            }
        }
        else{
            int den=(r2*r2)+(i2*i2);
            int conr=r2;
            int coni=i2*(-1);
            int dig1=r1*conr;
            int dig2=r1*coni;
            int dig3=i1*conr;
            int dig4=i1*coni;
            dig4=dig4*-1;
            int ansr=dig1+dig4;
            int ansi=dig2+dig3;
            if((int)(ansi/den)>=0)
                System.out.println((int)ansr/den+" + "+(int)ansi/den+"i");
                else
                System.out.println((int)ansr/den+" - "+Math.abs((int)ansi/den)+"i");
        }
    }
}