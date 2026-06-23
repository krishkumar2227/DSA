import java.util.ArrayList;
import java.util.List;
public class Q24_Sum_Of_Each_Row_2D_Array {
  public List<Integer>rowSum(int [][] arr){
    List<Integer> result= new ArrayList<>();
    int n= arr.length;
    int m =arr[0].length;
    for(int row=0;row<n;row++){
      int sum=0;
      for(int col=0;col<m;col++){
        sum +=arr[row][col];
      }
      result.add(sum);
    }
    return result;
  }
  public static void main(String[] args) {
    int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
    Q24_Sum_Of_Each_Row_2D_Array obj = new Q24_Sum_Of_Each_Row_2D_Array();

    System.out.println(obj.rowSum(arr));
  }
}