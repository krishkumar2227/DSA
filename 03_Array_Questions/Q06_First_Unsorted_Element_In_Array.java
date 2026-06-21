public class Q06_First_Unsorted_Element_In_Array {
  static int unsortedElement(int arr[]){
    for(int i =0;i<arr.length;i++){
      if(arr[i+1]<=arr[i]){
        return arr[i+1];
      }
      }
      return -1;
    }
    public static void main(String[] args) {
      int arr[]={1,2,3,5,10,6,13};
      System.out.println(unsortedElement(arr));
    }
  }
