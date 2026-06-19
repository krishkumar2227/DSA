public class Q14_Sort_Zeroes_And_Ones {
  static void sortZeroAndOne(int arr[]){
     int n = arr.length;
     int i =0;
     int j =n-1;
     while(i<j){
      if(arr[i]==1 & arr[j]==0){
        //swap
        arr[i]=0;
        arr[j]=1;
      }
      if(arr[i]==0){
        i++;
      }
      if(arr[j]==1){
        j--;
      }
     }
  }
  public static void main(String[] args) {
    int arr[]={1,0,0,1,1,0,1,1,1,0,0};
    sortZeroAndOne(arr);
    for(int n:arr){
      System.out.println(n);
    }
  }
  
}
