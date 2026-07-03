

public class Segregate_0s_and_1s {
  static void segregate0and1(int[] arr) {
        int n = arr.length;
        int i=0;
        int j =n-1;
        while(i<=j){
            if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
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
    int arr[]={0,0,0,1,1,1,1,0,0,0,1};
    segregate0and1(arr);
    for(int num:arr){
      System.out.println(num);
    }
  }
}

