import java.util.Arrays;
public class Q11_Eko_Spoj_Problem {
  static boolean isValidAns(int [] trees,int mid,int  m){
     int n = trees.length;
     int sum=0;
     for(int i =0;i<n;i++){
      if(trees[i]>mid){
        int ans=trees[i]-mid;
        sum=sum+ans;
      }
     }
      if(sum>=mid){
        return true;
      }else{
        return false;
     }
  }
  static int maxheight(int[] trees,int m){
    Arrays.sort(trees);
    int n = trees.length;
    int s=0;
    int max=-1;
    for(int i =0;i<n;i++){
      if(trees[i]>max){
        max=trees[i];
      }
    }
    int e= max;
    int ans=-1;
    while(s<=e){
      int mid=s+(e-s)/2;
      if((isValidAns(trees, mid, m))){
        ans=mid;
        s=mid+1;
      } else{
        e=mid-1;
      }  
    }
    return ans;
  }
  public static void main(String[] args) {
    int arr[]={20,15,10,17};
    int m=7;
    int ans=maxheight(arr, m);
    System.out.println(ans);
  }
}