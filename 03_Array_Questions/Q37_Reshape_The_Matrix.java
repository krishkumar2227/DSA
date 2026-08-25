public class Q37_Reshape_The_Matrix {
  public int[][] matrixReshape(int[][] mat, int r, int c){ 
        int ans[][] = new int[r][c];
        int n = mat.length;
        int m = mat[0].length;
        
        if(m*n != r*c){
            return mat;
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                int index=i*m+j;
                ans[index / c][index % c]=mat[i][j];
            }
        }
    return ans;
    }
}

