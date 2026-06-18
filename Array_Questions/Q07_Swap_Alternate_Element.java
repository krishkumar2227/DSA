public class Q07_Swap_Alternate_Element {
  static void swapAlternateElement(int arr[]){
    for(int i = 0;i<arr.length-1;i+=2){
      int temp=arr[i];
      arr[i]=arr[i+1];
      arr[i+1]=temp;
    }
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    swapAlternateElement(arr);
    for(int i =0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}
