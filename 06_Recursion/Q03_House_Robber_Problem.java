public class Q03_House_Robber_Problem {
  public static int solve(int []nums,int index){
    if(index>=nums.length){
      return 0;
    }
    int includeAns=nums[index]+solve(nums,index+2);
    int excludeAns=0+solve(nums,index+1);
    int finalAns=Math.max(includeAns,excludeAns);
    return finalAns;
    }
  public static int rob(int [] nums){
    int index=0;
    int ans=solve(nums,index);
    return ans;
  }
  public static void main(String[] args) {
    int nums[]={2,9,7,1};
    int ans=rob(nums);
    System.out.println(ans);

  }
}
