public class Q13_Search_In_Nearly_Sorted_Array {
  static int searchInNearlySortedArray(int arr[],int k){
    int n = arr.length;
    int s=0;
    int e=n-1;
    while(s<=e){
      int mid=s+(e-s)/2;
      if(mid-1>=0 && arr[mid-1]==k)
        return mid-1;
      if(arr[mid]==k)
        return mid;
      if(mid+1<n && arr[mid+1]==k)
        return mid+1;
      if(arr[mid]>k){
        e=mid-2;
      }else{
        s=mid+1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[]={10,30,20,50,40,60,80};
    int k =30;
    int ans=searchInNearlySortedArray(arr, k);
    System.out.println(ans);
  }
}
