public class Q03_Maximum_Element {
  static int maximumElement(int arr[]){
    int max=arr[0];
    for(int i=1;i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];
        
      }
    }
    return max;
  }
  public static void main(String[] args) {
    int arr[]={24,56,78,55,79};
    System.out.println(maximumElement(arr));
  }
}
