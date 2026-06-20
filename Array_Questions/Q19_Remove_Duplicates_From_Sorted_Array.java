public class Q19_Remove_Duplicates_From_Sorted_Array {
  static int removeDuplicates(int arr[]){
    int i =0;
    int j =1;
    int n =arr.length;
    while(j<n){
      if(arr[i]==arr[j]){
        j++;
      }else{
        i++;
        arr[i]=arr[j];
        j++;
      }
    }
    return i+1;
  }
  public static void main(String[] args) {
    int arr[]={1,2,2,3,3,3,4,4,5,6,6};
    int ans=removeDuplicates(arr);
    System.out.println(ans);
  }
}
