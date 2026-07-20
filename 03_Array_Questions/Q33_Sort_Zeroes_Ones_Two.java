public class Q33_Sort_Zeroes_Ones_Two {
  static public void sort012(int[] arr) {
        int n =arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                
                high--;
            }
        }
    for(int i = 0; i < arr.length; i++){
    System.out.print(arr[i] + " ");
    }
  }
  public static void main(String[] args) {
    int arr[]={2,0,1,2,0,1,2};
    sort012(arr);
  }
}

