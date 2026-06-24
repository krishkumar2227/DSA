public class Q27_Rotate_Image_Of_Matrix {
  static void rotateMatrixBy90(int[][] arr,int N){
    for(int i =0 ;i<N;i++){
      for(int j =i+1;j<N;j++){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
      }
    }
    for(int row=0;row<N;row++){
      int startCol=0;
      int endCol=N-1;
      while(startCol<endCol){
        int temp=arr[row][startCol];
        arr[row][startCol]=arr[row][endCol];
        arr[row][endCol]=temp;

        startCol++;
        endCol--;
      }
    }
  }
  public static void main(String[] args) {
    int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
    int N=arr.length;
    rotateMatrixBy90(arr, 3);
    for(int row=0;row<N;row++){
      for(int col=0;col<N;col++){
         System.out.print(arr[row][col] + " ");
      }
      System.out.println();
    }
  }
}
