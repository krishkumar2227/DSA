import java.util.ArrayList;
import java.util.Collections;

public class Q44_Relative_Sort_Array {
  public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int [] sortArr=new int[n];
        int k = 0;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(arr1[j]==arr2[i]){
                    sortArr[k]=arr1[j];
                    k++;
                }
            }
        }
    ArrayList<Integer> ans = new ArrayList<>();
    for(int i=0;i<n;i++){
        boolean found=false;
       for(int j =0;j<m;j++){
          if(arr1[i]==arr2[j]){
            found=true;
            break;
          }
       }
       if(found==false){
        ans.add(arr1[i]);
       }
    }
    Collections.sort(ans);
    for(int i = 0;i<ans.size();i++){
        sortArr[k]=ans.get(i);
        k++;
    }
    return sortArr;
    }
  public static void main(String[] args) {
      int arr1[]={2,3,1,3,2,4,6,7,9,2,19};
      int arr2[]={2,1,4,3,9,6};

      int[] ans=relativeSortArray(arr1, arr2);
      for(int x:ans){
        System.out.print(x + " ");
      }
  }
}
