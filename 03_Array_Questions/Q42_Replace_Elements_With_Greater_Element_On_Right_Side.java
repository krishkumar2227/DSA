public class Q42_Replace_Elements_With_Greater_Element_On_Right_Side {
      public int[] replaceElements(int[] arr) {
        int n = arr.length;
        if(n==1){
            return new int[]{-1};
        }
        int[] newArr=new int[n];
        newArr[n-1]=arr[n-1];

        for(int i=0;i<n;i++){
            int max=-1;
            if(i==n-1){
                newArr[n-2]=arr[i];
            }
            for(int j=i+1;j<n;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            newArr[i]=max;
        }
    return newArr;
    }
  
}
