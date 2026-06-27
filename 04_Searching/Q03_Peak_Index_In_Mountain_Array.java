public class Q03_Peak_Index_In_Mountain_Array {
  static int peakIndex(int[] arr){
    int n = arr.length;
    int s=0;
    int e=n-1;
    int ans=0;
    while(s<=e){
      int mid=s+(e-s)/2;
      if(arr[mid]<arr[mid+1]){
        s=mid+1;
      } else{
        //arr[mid]>=arr[mid+1];
        ans=mid;
        e=mid-1;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    int arr[]={1,2,5,4,2};
    int ans=peakIndex(arr);
    System.out.println(ans);
  }
}
