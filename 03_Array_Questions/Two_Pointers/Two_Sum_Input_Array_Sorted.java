import java.util.Arrays;
public class Two_Sum_Input_Array_Sorted {
  static  int[] twoSum(int[] numbers, int target) {
        int s=0;
        int n=numbers.length;
        int e=n-1;
        while(s<=e){
            if(numbers[s]+numbers[e]==target){
                return new int[]{s+1,e+1};
            }else if(numbers[s]+numbers[e]>target){
                e--;
            }else{
                s++;
            }
        }
        return new int[]{};
    }
  public static void main(String[] args) {
    int arr[]={2,7,11,15};
    int target=9;
    int ans[]=twoSum(arr,target);
    System.out.println(Arrays.toString(ans));
    }
  }


