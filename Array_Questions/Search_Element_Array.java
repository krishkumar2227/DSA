
//import com.sun.jdi.PathSearchingVirtualMachine;

public class Search_Element_Array {
  static int searchElement(int arr[],int target){
    int size = arr.length;
    for(int i = 0 ;i<size;i++){
      if(arr[i]==target){
        return i;
      }
    }
    return -1;
}
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    System.out.println(searchElement(arr,3));
    
  }
}
