public class Q21_Count_Inversions {
  public static int merge(int arr[],int s ,int e ,int mid){
    int leftArrLen=mid-s+1;
    int rightArrLen=e-mid;

    int []leftArr=new int[leftArrLen];
    int []rightArr=new int[rightArrLen];
    
    int k=s;
    for(int i =0;i<leftArrLen;i++){
      leftArr[i]=arr[k];
      k++;
    }
    k=mid+1;
    for(int j=0;j<rightArrLen;j++){
      rightArr[j]=arr[k];
      k++;
    }
    int i=0;
    int j =0;
    k = s;
    int invCount=0;
     while(i<leftArrLen && j<rightArrLen){
       if(leftArr[i]<rightArr[j]){
          arr[k]=leftArr[i];
          i++;
          k++;
       }else{
          arr[k]=rightArr[j];
          j++;
          k++;
          invCount=invCount+(leftArrLen-i);
       }
     }
     while(i<leftArrLen){
         arr[k]=leftArr[i];
         i++;
         k++;
     }
     while(j<rightArrLen){
      arr[k]=rightArr[j];
      j++;
      k++;
     }
    return invCount;
  }
  public static int mergeSort(int arr[],int s ,int e){
     if(s==e){
      return 0;
     }
     if(s>e){
      return 0;
     }
     int mid = s+(e-s)/2;
     int leftInversions=mergeSort(arr, s,mid );
     int rightInversions=mergeSort(arr, mid+1, e);
     int intermediateInversions=merge(arr,s,e,mid);
     int invCount=leftInversions+rightInversions+intermediateInversions;
     return invCount;
  }
  public static int inversionCount(int arr[]){
    int s = 0;
    int e = arr.length-1;
    int ans=mergeSort(arr, s, e);
    return ans;
  }
  public static void main(String[] args) {
      int arr[]={2,4,1,3,5};
      int answer=inversionCount(arr);
      System.out.println(answer);
  }
}
