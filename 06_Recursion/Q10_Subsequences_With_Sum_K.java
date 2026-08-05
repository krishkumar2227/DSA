public class Q10_Subsequences_With_Sum_K {
  public static boolean solve(int arr[],int k,int sum,int index){
  if(index>=arr.length){
    if(sum==k){
      return true;
    }else{
      return false;
    }
  }
  int currValue=arr[index];
  boolean includeAns=solve(arr, k, sum+currValue, index+1);
  boolean excludeAns=solve(arr, k, sum, index+1);
  boolean finalAns=includeAns || excludeAns;
  return finalAns;
}
  public static boolean subsequences(int arr[],int k){
      int sum=0;
      int index=0;
      boolean ans=solve(arr,k,sum,index);
      return ans;
  }
  public static void main(String[] args) {
    int arr[]={10, 1, 2, 7, 6, 1, 5};
    int k = 8;
    boolean ans=subsequences(arr,k);
    System.out.println(ans);
  }
}
