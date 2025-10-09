import java.util.*;
class Pattern_match{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String f=sc.nextLine();
    ArrayList <Integer> l=new ArrayList<>();
    for(int i=0;i<=s.length()-f.length();i++){
      boolean is = true;
      for(int j=0;j<f.length();j++){
        if(s.charAt(i+j)!=f.charAt(j)){
          is=false;
          break;
        }
      }
      if(is){
        l.add(i);
      }
    }
    if(l.size()==0){
      System.out.println("No match found");
    }
    else{
    for(int i=0;i<l.size();i++){
     System.out.print(l.get(i)+" ");
    }
    }
  }
}