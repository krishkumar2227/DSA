import java.util.ArrayList;
import java.util.List;

public class Q35_Find_All_K_Distinct_Indices_Of_Array{
   public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        List<Integer> result=new ArrayList<>();
        for(int i =0;i<n;i++){
          for(int j=0;j<n;j++){
             if(nums[j]==key && Math.abs(i-j)<=k){
                result.add(i);
                break;
             }
          }
        }
    return result;
    }
  public static void main(String[] args) {
    int arr[]={3,4,9,1,3,9,5};
    int key=9;
    int k =1;
    List<Integer> answer=findKDistantIndices(arr, key, k);
    System.out.println(answer);
  }
}