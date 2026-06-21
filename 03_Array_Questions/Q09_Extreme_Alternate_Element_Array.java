public class Q09_Extreme_Alternate_Element_Array {
  static void extremeAlternateElement(int arr[]){
    int start=arr[0];
    int end=arr.length-1;
    while(start<=end){
      System.out.println(arr[start]);
      start++;
      if(start<=end){
        System.out.println(arr[end]);
        end--;
      }
    }
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    extremeAlternateElement(arr);
  }
}
