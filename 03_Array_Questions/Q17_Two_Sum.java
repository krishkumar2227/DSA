import java.util.Arrays;
public class Q17_Two_Sum {
  static int[] twoSum(int arr[],int target){
     int n = arr.length;
     for(int i =0;i<n-1;i++){
      for(int j =i+1;j<n;j++){
        if(arr[i]+arr[j]==target){
          int ans[]={i,j};
            return ans;
        }
      }
     }
    int ans[]={};
    return ans;
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int target=8;
    int ans[]=twoSum(arr, target);
    System.out.println(Arrays.toString(ans));
    }
}
