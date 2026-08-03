public class Q09_Triangle_Problem {
  public static int solve(int [][] triangle,int rowIndex,int colIndex){
    if(rowIndex==triangle.length-1){
      return triangle[rowIndex][colIndex];
    }
    int downAns=solve(triangle,rowIndex+1,colIndex);
    int diagonalAns=solve(triangle, rowIndex+1, colIndex+1);
    int finalAns=triangle[rowIndex][colIndex]+Math.min(downAns,diagonalAns);
    return finalAns;
  }
  public static int triangleProblem(int[][] triangle){
    int rowIndex=0;
    int colIndex=0;
    int ans=solve(triangle,rowIndex,colIndex);
    return ans;
  }
  public static void main(String[] args) {
    int triangle[][]={{2},{3,4},{6,5,7},{4,1,8,3}};
    int ans=triangleProblem(triangle);
    System.out.println(ans);
  }
}
