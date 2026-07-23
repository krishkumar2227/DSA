public class Q04_Coin_Change {
  public static int solve(int amount,int[]coins,int index){
    if(amount==0){
      return 1;
    }
    if(amount<0){
      return 0;
    }
    if(index>=coins.length){
      return 0;
    }
    int includeAns=solve(amount-coins[index],coins,index);
    int excludeAns=solve(amount,coins,index+1);
    int finalAns=includeAns+excludeAns;
    return finalAns;
  }
  public static int coinChange(int [] coins,int amount){
      int index=0;
      int ans=solve(amount,coins,index);
      return ans;
  }
  public static void main(String[] args) {
    int coins[]={1,2,5};
    int amount=5;
    int ans=coinChange(coins, amount);
    System.out.println(ans);
  }
}
