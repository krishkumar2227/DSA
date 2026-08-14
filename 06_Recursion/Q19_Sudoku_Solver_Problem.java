public class Q19_Sudoku_Solver_Problem {
  public static boolean findEmptyCell(char[][]board,int []emptyCell){
    for(int i =0;i<9;i++){
      for(int j =0;j<9;j++){
        if(board[i][j]=='.'){
          emptyCell[0]=i;
          emptyCell[1]=j;
          return true;
        }
      }
    }
  return false;
  }
  public static boolean isSafeToPlace(char[][]board,char charValue,int rowIndex,int colIndex){
    for(int col=0;col<9;col++){
      if(board[rowIndex][col]==charValue){
        return false;
      }
    }
    for(int row=0;row<9;row++){
      if(board[row][colIndex]==charValue){
        return false;
      }
    }
    int startRow=rowIndex-rowIndex%3;
    int startCol=colIndex-colIndex%3;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        int actualRow=startRow+i;
        int actualCol=startCol+j;
        if(board[actualRow][actualCol]==charValue){
          return false;
        }
      }
    }
  return true;
  }
  public static boolean solveSudokuHelper(char[][]board){
     int [] emptyCell=new int[2];
     if(!findEmptyCell(board,emptyCell)){
      return true;
     }
     int rowIndex=emptyCell[0];
     int colIndex=emptyCell[1];
     for(int value=1;value<=9;value++){
      char charValue=(char)(value+'0');
      if((isSafeToPlace(board,charValue,rowIndex,colIndex))){
        board[rowIndex][colIndex]=charValue;
        if(solveSudokuHelper(board)==true){
          return true;
        }
        board[rowIndex][colIndex]='.';
      }
     }
    return false;
  }
  public static void sudokuProblem(char[][]board){
     solveSudokuHelper(board);
  }
  public static void main(String[] args) {
    char[][] board = {
    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},

    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},

    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
    };
    sudokuProblem(board);
       for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            System.out.print(board[i][j] + " ");
        }
        System.out.println();
    }
}
  }

