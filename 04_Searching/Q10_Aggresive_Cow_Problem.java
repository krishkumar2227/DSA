public class Q10_Aggresive_Cow_Problem {
  static public boolean isValidAns(int[] stalls,int k,int mid){
    int cowCount=1;
    int position=0;
    for(int i =1;i<stalls.length;i++){
      if(stalls[i]-stalls[position]>=mid){
           cowCount++;
           position=i;
           if(cowCount==k){
            return true;
           }
      }
    }
    return false;
  }
  public static  int aggresiveCows(int arr[],int k){
    int n =arr.length;
    int s=0;
    int e=arr[n-1]-arr[0];
    int ans=-1;
    while(s<=e){
      int mid=s+(e-s)/2;
      if((isValidAns(arr, k, mid))){
        ans=mid;
        s=mid+1;
      }else{
        e=mid-1;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    int arr[]={1,2,4,8,9};
    int k=3;
    int ans=aggresiveCows(arr, k);
    System.out.println(ans);
  }
}



