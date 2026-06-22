public class Q23_Maximum_Subarray { 
  static int maximumSubarray(int arr[]){
    int sum=0;
    int n =arr.length;
    int maxSum=Integer.MIN_VALUE;
    for (int i = 0; i < arr.length;i++) {
        sum=sum+arr[i];
        if(sum>maxSum){
          maxSum = Math.max(maxSum, sum);
        }
        if(sum<0){
          sum=0;
        }
    }
    return maxSum;
  }
  public static void main(String[] args) {
    int arr[]={-2,1,-3,4,-1,2,1};
    int ans=maximumSubarray(arr);
    System.out.println(ans);
  }
}

