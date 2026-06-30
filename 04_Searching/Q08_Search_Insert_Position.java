public class Q08_Search_Insert_Position {
  static int search(int arr[],int target){
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
  return s;
}
  public static void main(String[] args) {
      int arr[]={1,23,45,48,50,55};
      int target=24;
      int ans=search(arr, target);
      System.out.println(ans);
  }
}
  
  

