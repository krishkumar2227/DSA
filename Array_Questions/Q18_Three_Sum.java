import java.util.Arrays;
public class Q18_Three_Sum{
  static int[] threeSum(int arr[],int target){
    int n = arr.length;
    for(int i=0;i<n-2;i++){
      for(int j=i+1;j<n-1;j++){
        for(int k =i+2;k<n;k++){
          if(arr[i]+arr[j]+arr[k]==target){
            int ans[]={i,j,k};
            return ans;
          }
        }
      }
    }
    int ans[]={};
    return ans;
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9,10,11};
    int target=20;
    int ans[]=threeSum(arr,target);
    System.out.println(Arrays.toString(ans));
  }
}