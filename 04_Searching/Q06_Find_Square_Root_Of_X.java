public class Q06_Find_Square_Root_Of_X {
  static int squareRoot(int n){
    int s=0;
    int e=n;
    double ans=0;
    if(n==0){
      return 0;
    }
    while(s<=e){
      int mid=s+(e-s)/2;
      if(mid==n/mid){
        return mid;
      } else if(mid > n/mid){
        e=mid-1;
      } else{
        ans=mid;
        s=mid+1;
      }
    }
    double factor=1;
    int totalPrecision=3;
    for(int round=1;round<=totalPrecision;round++){
      factor=factor/10;
      for(int i =0;i<10;i++){
        double newAns=ans+factor;
        if(newAns*newAns<n){
          ans=newAns;
        }else{
          break;
        }
      }
    }
    System.out.println("Final Ans:"+Math.round(ans*1000.0)/1000.0);
    return 1;
  }
  public static void main(String[] args) {
    int n=56;
    int ans=squareRoot(n);
    System.out.println(ans);
  }
}
