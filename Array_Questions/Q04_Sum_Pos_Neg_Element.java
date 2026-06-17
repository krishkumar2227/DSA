public class Q04_Sum_Pos_Neg_Element {
  static void sumOfPositiveNegativeElement(int arr[]){
    int posSum=0;
    int negSum=0;
    for(int i =0;i<arr.length;i++){
      if(arr[i]>0){
        posSum=posSum+arr[i];
      }else{
        negSum=negSum+arr[i];
      }
    }
    System.out.println(posSum);
    System.out.println(negSum);
  }
  public static void main(String[] args) {
    int arr[]={3,4,-1,7,-2,-9,10,12};
    sumOfPositiveNegativeElement(arr);
  }
}
