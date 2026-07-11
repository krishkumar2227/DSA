import java.util.ArrayList;
import java.util.Collections;

public class Q32_Array_Leaders {
  static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result= new ArrayList<>();
        int n = arr.length;
        int maxFromright=arr[n-1];
        result.add(maxFromright);
        for(int i = n-2;i>=0;i--){
            if(arr[i]>=maxFromright){
                result.add(arr[i]);
                maxFromright=arr[i];
            }
        }
        Collections.reverse(result);
        return result;
    }
}
