public class Q07_Allocate_Minimum_Pages {
  static boolean validAns(int arr[],int k ,int maxPages){
    int studentCount=1;
    int pages=0;
    for(int i =0;i<arr.length;i++){
      if(pages+arr[i]<=maxPages){
        pages=pages+arr[i];
      }else{
        studentCount++;
        if(studentCount>k || arr[i] > maxPages){
          return false;
        }else{
          pages=0;
          pages=pages+arr[i];
        }
      }
    }
    return true;
  }
  public static  int findMinPage(int arr[],int k){
    int n =arr.length;
    if(n<k){
      return -1;
    }
    int s=1;
    int sum=0;
    for(int i =0;i<n;i++){
      sum=sum+arr[i];
    }
    int e=sum;
    int ans=-1;
    while(s<=e){
      int maxPages=s+(e-s)/2;
      if((validAns(arr, k, maxPages))){
        ans=maxPages;
        e=maxPages-1;
      }else{
        s=maxPages+1;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    int arr[]={10,20,30,40,50};
    int k=2;
    int ans=findMinPage(arr, k);
    System.out.println(ans);
  }
}
