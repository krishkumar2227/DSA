public class Q01_Binary_Search_Implementation {
  static int binarySearch(int arr[],int target){
    int n = arr.length;
    int s=0;
    int e=n-1;
    while(s<=e){
      int mid=s+(e-s)/2;
      if(arr[mid]==target){
        return mid;
      } else if(arr[mid]>target){
        e=mid-1;
      } else{
        s=mid+1;
      }
  }
  return -1;
}
  public static void main(String[] args) {
      int arr[]={1,23,45,6,7,8,9};
      int target=6;
      int ans=binarySearch(arr, target);
      System.out.println(ans);
  }
}


