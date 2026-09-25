public class Q43_Find_Number_Of_Even_Digits_In_Number {
   public static  int findNumbers(int[] nums) {
        int n = nums.length;
        int countNumberEven=0;
        
        for(int i=0;i<n;i++){
           int x = nums[i];
           int count=0;
           while(x!=0){
            int digit=x%10;
            count++;
            x=x/10;
           }
           if(count % 2 == 0){
              countNumberEven++;
           }
        }
    return countNumberEven;
    }
    public static void main(String[] args) {
        int [] nums={12,4,6,7,12345};
        int ans=findNumbers(nums);
        System.out.println(ans);
    }
}
