public class Q15_Non_Duplicate_Element_In_Array {
  static int nonDuplicateElement(int arr[]){
    int n = arr.length;
    int s=0;
    int e=n-1;
    while(s<=e){
      int mid=s+(e-s)/2;
      if(s==e){
        return arr[s];
      }
      int currentValue=arr[mid];
      int prevValue=-1;
      if(mid-1>=0){
        prevValue=arr[mid-1];
      }
      int nextValue=-1;
      if(mid+1<n){
        nextValue=arr[mid+1];
      }
      if(currentValue!=prevValue && currentValue !=nextValue){
        return currentValue;
      }
      if(currentValue==prevValue && currentValue != nextValue){
        int endingIndexOfPair=mid;
        if((endingIndexOfPair & 1)==1){
           s=mid+1;
        }else{
          e=mid-1;
        }
      }
      if(currentValue!=prevValue && currentValue == nextValue){
        int startingIndexOfPair=mid;
        if((startingIndexOfPair & 1)==1){
           e=mid-1;
        }else{
           s=mid+1;
        }
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[]={10,10,20,20,30,30,40,40,50,60,60};
    int ans=nonDuplicateElement(arr);
    System.out.println(ans);
  }
}
