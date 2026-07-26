public class Q06_Partition_Equal_Subset_Sum {
  public static boolean solve(int[]nums,int index,int target){
    if(target==0){
      return true;
    }
    if(target<0){
      return false;
    }
    if(index>=nums.length){
      return false;
    }
    boolean includeAns=solve(nums,index+1,target-nums[index]);
    boolean excludeAns=solve(nums,index+1,target);

    return includeAns || excludeAns;
  }
  public static boolean partition(int[]nums){
    int sum=0;
    for(int num:nums){
      sum=sum+num;
    }
    int target=sum/2;

    if((sum&1)==1){
      return false;
    }

    int index=0;
    boolean ans=solve(nums,index,target);
    return ans;
  }
  public static void main(String[] args) {
    int nums[]={1,5,11,5};
    boolean ans=partition(nums);
    System.out.println(ans);
  }
}
