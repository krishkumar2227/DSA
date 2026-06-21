public class Q13_Shift_Array_Element_K_Pos {
  static void shiftElementByK(int arr[],int k){
    int n = arr.length;
    int temp[]=new int [n];
    for(int i =0;i<n;i++){
      temp[(i+k)%n]=arr[i];
    }
    for(int i = 0; i < arr.length; i++) {
      arr[i]=temp[i];
    }
}
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    shiftElementByK(arr, 4);
    for(int num:arr){
      System.out.println(num);
    }
  }
}

