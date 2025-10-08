import java.util.*;
class OptimalActivityScheduling{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    timings [] schedule=new timings[n];
    for(int i=0;i<n;i++)
    schedule[i]=new timings(sc.nextInt(),sc.nextInt());
    System.out.print(ans(schedule));
  }
  static int ans(timings [] schedule){
    Arrays.sort(schedule,(a,b) -> a.end-b.end);
    int count=1;
    int ends=schedule[0].end;
    for(int i=1;i<schedule.length;i++){
      if(ends<=schedule[i].start){
        count++;
        ends=schedule[i].end;
      }
    }
    return count;
  }
  static class timings{
    int start,end;
    timings(int s,int e){
      start=s;
      end=e;
    }
  }
}