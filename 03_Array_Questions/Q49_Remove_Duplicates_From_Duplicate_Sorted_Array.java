public class Q49_Remove_Duplicates_From_Duplicate_Sorted_Array {
  public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 2;
        
        for(int j = 2;j<n;j++){
            if(nums[j] != nums[i-2]){
                nums[i]=nums[j];
                i++;
            }
        }
    return i;
    }
}
