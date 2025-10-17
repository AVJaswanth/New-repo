import java.util.*;
class Matrix_From_Array {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        List<List<Integer>> result = solution.findMatrix(nums);
        System.out.println(result);
    }
}
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]))
            map.put(nums[i],1);
            else
            map.put(nums[i],map.get(nums[i])+1);
        }
        List <List <Integer> > l=new ArrayList<>();
        while(true){
            boolean is=true;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue()!=0){
                    is=false;
                    break;
                }
            }
            if(is){
                break;
            }
            ArrayList <Integer> nl=new ArrayList <>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue()!=0){
                    nl.add(entry.getKey());
                    map.put(entry.getKey(),entry.getValue()-1);
                }
            }
            l.add(nl);
        }
        return l;
    }
}

