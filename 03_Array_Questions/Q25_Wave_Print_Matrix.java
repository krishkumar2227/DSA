import java.util.ArrayList;
import java.util.List;

public class Q25_Wave_Print_Matrix {
  public List<Integer>wavePrint(int [][] arr){
    List<Integer> result= new ArrayList<>();
    int n = arr.length;
    int m =arr[0].length;
    for(int col =0;col<n;col++){
      if((col & 1) ==1){
        for(int row=m-1;row>=0;row--){
          result.add(arr[row][col]);
        }
      } else {
        for(int row=0;row<m;row++){
          result.add(arr[row][col]);
        }
      }
    }
    return result;
 }
 public static void main(String[] args) {
    int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
    Q25_Wave_Print_Matrix obj = new Q25_Wave_Print_Matrix();

    System.out.println(obj.wavePrint(arr));
  }
}