public class Q05_Search_In_Rotated_Array {
  static int pivotIndex(int [] nums){
    int n = nums.length;
    int s=0;
    int e=n-1;
    int ans=-1;
    while(s<=e){
      int mid=s+(e-s)/2;
      if(nums[mid]<=nums[n-1]){
        e=mid-1;
      } else{
        ans=mid;
        s=mid+1;
      }
    }
    return ans;
  }
  static int binarySearch(int [] nums,int s ,int e, int target){
    while(s<=e){
      int mid=s+(e-s)/2;
      if(nums[mid]==target){
        return mid;
      } else if(nums[mid]<target){
        s=mid+1;
      }else{
        e=mid-1;
      }
    }
    return -1;
  }
  public static int search(int [] nums,int target){
    int n = nums.length;
    int pivotindex=pivotIndex(nums);
    if(pivotindex==-1){
      int ans= binarySearch(nums, 0, n-1, target);
      return ans;
    } else{
       int startArray1=0;
       int endArray1=pivotindex;
       if(target>=nums[startArray1] && target<=nums[endArray1]){
        int ans=binarySearch(nums, startArray1, endArray1, target);
        return ans;
       }
       int startArray2=pivotindex+1;
       int endArray2=n-1;
       if(target>=nums[startArray2] && target<=nums[endArray2]){
        int ans=binarySearch(nums, startArray2, endArray2, target);
          return ans;
       }
    }
    return -1;
  }
  public static void main(String[] args) {
    int  nums[]={50,60,70,10,20,30,40};
    int target=30;
    int ans=search(nums, target);
    System.out.println(ans);
  }
}
