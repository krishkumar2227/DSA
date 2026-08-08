import java.util.*;
public class Q12_Subsets2 {
  public static void solve(int []nums,int index,List<Integer>output,List<List<Integer>> ans){
    if(index>=nums.length){
      ans.add(new ArrayList<>(output));
      return;
    }
    int currValue=nums[index];
    output.add(currValue);
    solve(nums, index+1, output, ans);
    
    output.remove(output.size()-1);

    while(index+1<nums.length && nums[index]==nums[index+1]){
      index++;
    }
    solve(nums, index+1, output, ans);
  }
  public static List<List<Integer>> subsetsSecond(int[] nums){
     List<Integer>output = new ArrayList<>();
     List<List<Integer>> ans= new ArrayList<>();
     int index=0;
     solve(nums,index,output,ans);
     return ans;
  }
  public static void main(String[] args) {
    int nums[]={1,2,2};
    List<List<Integer>> ans=subsetsSecond(nums);
    System.out.println(ans);

  }
}
