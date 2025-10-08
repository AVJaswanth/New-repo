import java.util.*;
class Knapsack{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int cap_n=sc.nextInt();
    int cap_size=sc.nextInt();
    drone [] arr=new drone[cap_n];
    for(int i=0;i<cap_n;i++){
      arr[i]=new drone(sc.nextInt(),sc.nextInt(),i);
    }
    System.out.printf("%.2f",ans(arr,cap_size));
  }
  static float ans(drone [] arr,int cap_size){
    frac [] arr1=new frac[arr.length];
    for(int i=0;i<arr.length;i++)
    arr1[i]=new frac(i,((float)arr[i].val/arr[i].size));
    Arrays.sort(arr1,(a,b)->Float.compare(b.per,a.per));
    float tot=0;
    int count=0;
    while(cap_size!=0 && count<arr.length){
      int idx=arr1[count].ind;
      if(arr[idx].size<=cap_size){
        tot+=arr[idx].val;
        cap_size-=arr[idx].size;
      }
      else{
        tot+=arr[idx].val*((float)cap_size/arr[idx].size);
          cap_size=0;
      }
      count++;
    }
    return tot;
  }
  static class drone{
    int val,size,idx;
    drone(int v,int s,int i){
      val=v;
      size=s;
      idx=i;
    }
  }
  static class frac{
    float per;
    int ind;
    frac(int id,float p){
      per=p;
      ind=id;
    }
  }
}