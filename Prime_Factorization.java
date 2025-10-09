import java.util.*;
class Prime_Factorization{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    while(num!=1){
      int div=num;
      for(int i=2;i<=num;i++){
        if((i==2 && num%i==0) || (i==3 && num%i==0)){
          div=i;
          break;
        }
        if(i==2 || i==3 )
          continue;
        boolean isprime=true;
        for(int j=2;j<=(int)Math.sqrt(i);j++){
          if(i%j==0){
            isprime=false;
            break;
          }
        }
        if(isprime){
          if(num%i==0){
            div=i;
            break;
          }
        }
      }
      System.out.print(div+" ");
      num/=div;
    }
  }
}

