public class Q20_Merge_Sort {
  public static void merge(int[] arr,int s,int e,int mid){
    int leftArrLen=mid-s+1;
    int rightArrLen=e-mid;

    int leftArr[]=new int[leftArrLen];
    int rightArr[]=new int[rightArrLen];

    int k = s;
    for(int i =0;i<leftArrLen;i++){
      leftArr[i]=arr[s+i];
      k++;
    }
    k = mid+1;
    for(int j =0;j<rightArrLen;j++){
      rightArr[j]=arr[mid+1+j];
      k++;
    }
    int i =0;
    int j = 0;
    k=s;
    while(i<leftArrLen && j < rightArrLen){
      if(leftArr[i]<rightArr[j]){
        arr[k]=leftArr[i];
        i++;
        k++;
      }else{
        arr[k]=rightArr[j];
        j++;
        k++;
      }
    }
    while(j<rightArrLen){
      arr[k]=rightArr[j];
      j++;
      k++;
    }
    while(i<leftArrLen){
      arr[k]=leftArr[i];
      i++;
      k++;
    }
  }
  public static void mergeSort(int []arr,int l,int r){
    int s=l;
    int e = r;
    if(s>=e){
      return;
    }
    int mid=s+(e-s)/2;

    mergeSort(arr,s,mid);
    mergeSort(arr,mid+1,e);

    merge(arr,s,e,mid);
  }
  public static void main(String[] args) {
    int arr[]={8,3,4,5,6,7,1,2};
    int l = 0;
    int r = arr.length-1;
    mergeSort(arr,l,r);
    for(int x : arr){
    System.out.print(x + " ");
    }
  }
}
