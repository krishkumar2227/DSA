public class Q30_Move_Zeroes {
    static public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        for(int num:nums){
          System.out.println(num);
        }
    }
    public static void main(String[] args) {
      int arr[]={12,0,1,0,3};
      moveZeroes(arr);
    }
}

