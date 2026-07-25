public class Q05_Coin_Change2 {
  public static int solve(int[]coins,int amount){
    if(amount==0){
      return 0;
    }
    if(amount<0){
      return Integer.MAX_VALUE;
    }
    int mini=Integer.MAX_VALUE;
    for(int coin:coins){
      int recursionAns=solve(coins,amount-coin);
      if(recursionAns!=Integer.MAX_VALUE){
        int totalAns=recursionAns+1;
        mini=Math.min(mini, totalAns);
      }
  }
  return mini;
}
  public static int coinChange(int[]coins,int amount){
    int ans=solve(coins,amount);
    if(ans==Integer.MAX_VALUE){
      return -1;
    }else{
      return ans;
    }
}
  public static void main(String[] args) {
    int coins[]={1,2,5};
    int amount=6;
    int ans=coinChange(coins, amount);
    System.out.println(ans);
  }
}
