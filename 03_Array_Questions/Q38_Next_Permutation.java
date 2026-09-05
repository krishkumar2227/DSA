public class Q38_Next_Permutation {
  public void reverse(int []nums,int s ,int e){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;

            s++;
            e--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind=-1;
        for(int i = n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind!=-1){
        for(int i = n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        }
        int s = ind+1;
        int e = n-1;
        reverse(nums,s,e);
    }
}
