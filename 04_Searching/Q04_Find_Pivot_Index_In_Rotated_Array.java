public class Q04_Find_Pivot_Index_In_Rotated_Array {
  static int pivotIndex(int arr[]){
    int n =arr.length;
    int s=0;
    int e=n-1;
    int ans=0;
    while(s<=e){
      int mid=s+(e-s)/2;
      if(arr[mid]<=arr[n-1]){
        e=mid-1;
      }else{
        ans=mid;
        s=mid+1;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    int arr[]={50,60,70,10,20,30,40};
    int ans=pivotIndex(arr);
    System.out.println(ans);
  }
}

