public class Q26_Transpose_Of_Matrix {
  public int [][] tranposeMatrix(int [][] arr){
    if(arr==null || arr.length==0){
      return new int[0][0];
    }
    int totalRow=arr.length;
    int totalCol=arr[0].length;
    
    int newTotalRow=totalRow;
    int newTotalCol=totalCol;
    int[][] ans= new int[newTotalRow][newTotalCol];
    
    for(int i =0;i<totalRow;i++){
      for(int j=0;j<totalCol;j++){
        ans[j][i]=arr[i][j];
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
     Q26_Transpose_Of_Matrix obj = new Q26_Transpose_Of_Matrix();

    int[][] result = obj.tranposeMatrix(arr);

    for(int i = 0; i < result.length; i++) {
        for(int j = 0; j < result[0].length; j++) {
            System.out.print(result[i][j] + " ");
        }
        System.out.println();
    }
}
  }

