public class Q22_Quick_Sort {
  public static int partition(int arr[],int s,int e){
    int pivotElement=arr[s];
    int count=0;
    for(int i=s+1;i<=e;i++){
        if(arr[i]<=pivotElement){
          count++;
        }
    }
    int correctPosition=s+count;
    int temp=arr[correctPosition];
    arr[correctPosition]=arr[s];
    arr[s]=temp;

    int i=s;
    int j=e;
    while(i<correctPosition && j>correctPosition){
      while(arr[i]<=pivotElement){
        i++;
      }
      while(arr[j]>pivotElement){
        i++;
      }
      if(i<correctPosition && j>correctPosition){
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        i++;
        j--;
      }
    }
  return correctPosition;
  }
  public static void quickSort(int []arr,int low,int high){
    int s =low;
    int e= high;
    if(s>=e){
      return;
    }
    int pivotIndex=partition(arr,s,e);
    quickSort(arr,s,pivotIndex-1);
    quickSort(arr,pivotIndex+1,e);
  }

  public static void main(String[] args) {
    int arr[]={3,8,5,4,7,6,2,1};
    int low=0;
    int high=arr.length-1;
    quickSort(arr,low,high);
    
    for(int x:arr){
      System.out.print(x + " ");
    }
  }
}
