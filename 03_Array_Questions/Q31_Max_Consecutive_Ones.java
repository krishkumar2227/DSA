public class Q31_Max_Consecutive_Ones {
    static public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count=0;
        int ans=0;
        for(int i =0;i<n;i++){
            if(nums[i]==1){
                count++; 
                if(ans<count){
                    ans=count;
                }
            }else{
                count=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
      int arr[]={1,1,0,1,1,1,1};
      int ans=findMaxConsecutiveOnes(arr);
      System.out.println(ans);
    }
}

