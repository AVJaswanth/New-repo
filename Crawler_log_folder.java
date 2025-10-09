import java.util.*;
class Crawler_log_folder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] logs=new String[sc.nextInt()];
        for(int i=0;i<logs.length;i++){
            logs[i]=sc.next();
        }
        Solution obj=new Solution();
        System.out.println(obj.minOperations(logs));
    }
}
class Solution {
    public int minOperations(String[] logs) {
        Stack <String> st=new Stack <>();
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("./"))
            continue;
            else if(logs[i].equals("../")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(logs[i]);
            }
        }
        return st.size();
    }
}
