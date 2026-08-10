import java.util.*;
public class Q16_Rate_In_maze {
  public static boolean isSafeToMove(int newX,int newY,int n ,int[][]maze,boolean[][]visited){
    if(newX<0 ||  newX>=n || newY<0 || newY>=n){
      return false;
    }
      if(maze[newX][newY]==0){
      return false;
    }
     if(visited[newX][newY]==true){
      return false;
    }
      return true;
  }
  public static void solve(int[][]maze,int srcX,int srcY,int destX,int destY,boolean[][]visited,ArrayList<String> ans,String path){
    if(srcX==destX && srcY==destY){
      ans.add(path);
      return;
    }
    visited[srcX][srcY]=true;
    int n = maze.length;
    int newX=srcX-1;
    int newY=srcY;
    if(isSafeToMove(newX,newY,n,maze,visited)){
      solve(maze, newX, newY, destX, destY, visited, ans, path+"U");
    }
    newX=srcX+1;
    newY=srcY;
    if(isSafeToMove(newX,newY,n,maze,visited)){
      solve(maze, newX, newY, destX, destY, visited, ans, path+"D");
    }
    newX=srcX;
    newY=srcY-1;
    if(isSafeToMove(newX,newY,n,maze,visited)){
      solve(maze, newX, newY, destX, destY, visited, ans, path+"L");
    }
    newX=srcX;
    newY=srcY+1;
    if(isSafeToMove(newX,newY,n,maze,visited)){
      solve(maze, newX, newY, destX, destY, visited, ans, path+"R");
    }
    visited[srcX][srcY]=false;
  }
  public static ArrayList<String> rateInMaze(int [][]maze){
    int srcX=0;
    int srcY=0;
    int n = maze.length;
    int destX=n-1;
    int destY=n-1;
    boolean[][]visited=new boolean[n][n];
    ArrayList<String> ans= new ArrayList<>();
    String path="";
    if(maze[0][0]==0 || maze[n-1][n-1]==0){
       return ans;
    }
    solve(maze,srcX,srcY,destX,destY,visited,ans,path);
    return ans;
  }
  public static void main(String[] args) {
    int maze[][]={{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
    ArrayList<String> answer;
    answer=rateInMaze(maze);
    System.out.println(answer);
  }
}
