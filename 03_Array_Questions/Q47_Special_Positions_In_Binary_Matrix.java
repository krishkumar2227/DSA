public class Q47_Special_Positions_In_Binary_Matrix {
  public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        int count=0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(mat[i][j]==1){
                    boolean isValid=true;
                    for(int k = 0;k<n;k++){
                        if(k != j  && mat[i][k]==1){
                            isValid=false;
                            break;
                        }
                    }
                    for(int a = 0;a<m;a++){
                        if(a !=i && mat[a][j]==1){
                            isValid=false;
                            break;
                        }
                    }
                if(isValid){
                    count++;
                  }
                }
            }
        }
    return count;
    }
}
