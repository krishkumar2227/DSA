public class Q14_Maximum_Candies_Allocated_to_Children{
  static public boolean isValidAns(int[] candies,int mid,long k){
        long childCount=0;
        for(int i =0;i<candies.length;i++){
            childCount=childCount+candies[i]/mid;

            if(childCount>=k){
                return true;
            }
        }
        return false;
    }
  static public int maximumCandies(int[] candies, long k) {
        long sum=0;
        for(int i =0;i<candies.length;i++){
            sum=sum+candies[i];
        }
        if(sum < k){
            return 0;
        }
        int n = candies.length;
        int s=1;
        int maxCandy=-1;
        for(int i =0;i<n;i++){
            if(candies[i]>maxCandy){
                maxCandy=candies[i];
            }
        }
        int e=maxCandy;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValidAns(candies,mid,k)){
                ans=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
      int candies[]={5,8,9};
      int k = 3;
      int ans=maximumCandies(candies, k);
      System.out.println(ans);
    }
}
