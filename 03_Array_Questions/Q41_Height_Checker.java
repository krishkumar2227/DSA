import java.util.Arrays;
public class Q41_Height_Checker {
  public int heightChecker(int[] heights) {
       int n = heights.length;
       int count=0;
       
       int expected[]=heights.clone();

       Arrays.sort(expected);
       for(int i =0;i<expected.length;i++){
            if(heights[i]!=expected[i]){
              count++;
           }
        }
    return count;
    }
}
