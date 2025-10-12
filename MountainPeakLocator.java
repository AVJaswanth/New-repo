import java.util.*;
class MountainPeakLocator{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int len=sc.nextInt();
    int arr[]=new int[len];
    for(int i=0;i<len;i++)
      arr[i]=sc.nextInt();
    int low=0;
    int high=len-1;
    while(low<high){
     int mid=(low+high)/2;
      if(arr[mid]<arr[mid+1]){
        low=mid+1;
      }
      else{
        high=mid;
      }
    }
    System.out.println(low);
  }
}