public class Q05_Count_No_Of_Zeroes_And_Ones {
  static void countZeroesAndOnes(int arr[]){
    int count=0;
    int count1=0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==0){
           count++;
        }
        if(arr[i]==1){
          count1++;
        }
    }
    System.out.println("No Of zeroes in the array " + count);
    System.out.println("No of ones in the array " + count1);
  }
  public static void main(String[] args) {
      int arr[]={1,2,3,0,1,5,1,0};
      countZeroesAndOnes(arr);
  }
}
