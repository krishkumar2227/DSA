public class Q22_Missing_Elements_From_Array_Of_Duplicates {
  static void missingElementFromArray(int arr[]){
    int n = arr.length;
    for(int i =0;i<n;i++){
      int value = Math.abs(arr[i]);
      int pos=value-1;
      if(arr[pos]>0){
        arr[pos]=-arr[pos];
      }
    }
    for(int m =0;m<n;m++){
      if(arr[m]>0){
        int valueAtThisIndex=m+1;
        System.out.println(valueAtThisIndex);
      }
    }
  }
  public static void main(String[] args) {
    int arr[]={1,4,4,5,2,2};
    missingElementFromArray(arr);
  }
}
