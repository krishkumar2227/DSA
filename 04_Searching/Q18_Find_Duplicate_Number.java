public class Q18_Find_Duplicate_Number {
  public static int findDuplicate(int []nums){
    int n = nums.length;
    int low=0;
    int high=n-1;
    while(low<high){
      int mid=low+(high-low)/2;
      int count=0;
      for(int i=0;i<n;i++){
        if(nums[i]<=mid){
          count++;
        }
      }
      if(count>mid){
        high=mid;
      }else{
        low=mid+1;
      }
    }
  return low;
  }
  public static void main(String[] args) {
    int nums[]={1,3,4,2,2};
    int ans=findDuplicate(nums);
    System.out.println(ans);
  }
}
