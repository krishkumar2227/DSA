public class Q44_Matrix_Diagonal_Sum {
  public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int a = 0;

        if(n==1 && m ==1){
            return mat[0][0];
        }
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                if(i==j || i+j==n-1){
                    a = mat[i][j] + a;
                }
            }
        }
    return a;
    }
  public static void main(String[] args) {
      int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
      int ans=diagonalSum(mat);
      System.out.println(ans);
  }
}
