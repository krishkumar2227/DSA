//package 04_Searching;

public class Q02_Number_Of_Occurence_Of_Target_Element {
  static int getLowerBound(int arr[],int target){
    int n = arr.length;
    int s=0;
    int e=n-1;
    int ans=n;
    while(s<=e){
      int mid=s+(e-s)/2;
      if(arr[mid]>=target){
        ans=mid;
        e=mid-1;
      } else{
        s=mid+1;
      }
    }
    return ans;
  }
  static int getUpperBound(int arr[],int target){
    int n = arr.length;
    int s=0;
    int e=n-1;
    int ans=n;
    while(s<=e){
      int mid=s+(e-s)/2;
      if(arr[mid]<=target){
        s=mid+1;
      }else{
        ans=mid;
        e=mid-1;
      }
  }
  return ans;
 }
 public static void main(String[] args) {
  int arr[]={10,20,20,20,20,20,30,3,40,40,50};
  int target=20;
  int lowerBound=getLowerBound(arr, target);
  int upperBound=getUpperBound(arr, target);
  int noOfOccurence=upperBound-lowerBound;
  System.out.println(noOfOccurence);
 }
}
