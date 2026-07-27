public class Q07_Minimize_The_Difference_between_Target_Chosen_Element {
  public static int solve(int[][]mat,int target,int sum,int row){
    if(row>=mat.length){
      return Math.abs(target-sum);
    }
    int mini=Integer.MAX_VALUE;
    for(int num:mat[row]){
      int ans=solve(mat, target, sum+num, row+1);
      mini=Math.min(mini,ans);
    }
    return mini;
  }
  public static int minimizeTheDifference(int [][] mat,int target){
    int sum=0;
    int row=0;
    int ans=solve(mat,target,sum,row);
    return ans;
  }
  public static void main(String[] args) {
    int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
    int target=12;
    int ans=minimizeTheDifference(mat, target);
    System.out.println(ans);
  }
}
