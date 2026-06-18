public class Q08_Array_Intersection_Element {
  static void intersectionElement(int arr1[],int arr2[]){
    for(int i =0;i<arr1.length;i++){
      for(int j =0;j<arr2.length;j++){
        if(arr1[i]==arr2[j]){
          System.out.println(arr2[j]);
        }
      }
    }
  }
  public static void main(String[] args) {
    int arr1[]={1,2,3,4,5,6};
    int arr2[]={7,8,2,10,3,12,4};
    intersectionElement(arr1, arr2);
  }
}
