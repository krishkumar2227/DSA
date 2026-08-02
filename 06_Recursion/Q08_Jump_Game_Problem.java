public class Q08_Jump_Game_Problem{
  public static boolean solve(int arr[],int index){
    if(index==arr.length){
      return true;
    }
    if(index>=arr.length){
      return false;
    }
    if(arr[index]==0){
      return false;
    }
    int jumpValue=arr[index];
    boolean overAllAns=false;
    for(int jump=1;jump<=jumpValue;jump++){
      boolean recAns=solve(arr, index+jump);
      overAllAns=overAllAns || recAns;
    }
    return overAllAns;
  }

  public static boolean jumpGame(int arr[]){
     int index=0;
     boolean ans= solve(arr,index);
     return ans;
  }
  public static void main(String[] args) {
    int arr[]={2,3,1,1,4};
    boolean ans = jumpGame(arr);
    System.out.println(ans);
  }
}