import java.util.*;
class FirstAndLastIndexFinder{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int len=sc.nextInt();
    int [] arr=new int[len];
    for(int i=0;i<len;i++){
      arr[i]=sc.nextInt();
    }
    int tar=sc.nextInt();
    int low=0;
    int high=len-1;
    int f=-1;
    int l=-1;
    while(low<=high){
      int mid=(low+high)/2;
      if(arr[mid]==tar){
        f=mid;
        high=mid-1;
      }
      else if(tar>arr[mid]){
        low=mid+1;
      }
      else{
        high=mid-1;
      }
    }
    low=0;
    high=len-1;
    while(low<=high){
      int mid=(low+high)/2;
      if(arr[mid]==tar){
        l=mid;
        low=mid+1;
      }
      else if(tar>arr[mid]){
        low=mid+1;
      }
      else{
        high=mid-1;
      }
    }
    System.out.println("["+f+", "+l+"]");
  }
}