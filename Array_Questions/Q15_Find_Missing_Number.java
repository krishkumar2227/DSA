public class Q15_Find_Missing_Number {
  static int missingNumber(int arr[]){
    int xorSum=0;
    int n = arr.length;
    for(int num:arr){
      xorSum=xorSum^num;
    }
    for(int i =0;i<=n;i++){
      xorSum=xorSum^i;
    }
    return xorSum;
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,0};
    System.out.println(missingNumber(arr));
  }
}
