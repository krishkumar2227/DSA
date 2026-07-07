public class Q17_Row_With_Maximum_1 {
  static int getfirstOccurence(int arr[][],int rowIndex){
    int totalRow=arr.length;
    int totalCol=arr[0].length;
    int ans=-1;
    int s=0;
    int e=totalCol-1;
    while(s<=e){
      int mid = s+(e-s)/2;
      if(arr[rowIndex][mid]==0){
        s=mid+1;
      }else{
        ans=mid;
        e=mid-1;
      }
    }
    return ans;
  }
  static int maximum1(int arr[][]){
    int totalRow=arr.length;
    int totalCol=arr[0].length;
    int max=-1;
    int maximum1Index=-1;
    for(int row=0;row<totalRow;row++){
      int frequecency1=getfirstOccurence(arr, row);
      int count=totalCol-frequecency1;
      if(count>max){
        max=count;
        maximum1Index=row;
      }
    }
    return maximum1Index;
  }
  public static void main(String[] args) {
    int arr[][]={{0,0,0,0,1},{0,0,0,1,1},{0,1,1,1,1}};
    int ans=maximum1(arr);
    System.out.println(ans);
  }
}
