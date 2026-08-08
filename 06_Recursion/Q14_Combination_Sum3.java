import java.util.*;
public class Q14_Combination_Sum3 {
  public static void solve(int[]candidates,int target,int index,List<List<Integer>> ans,List<Integer> output,int count,int k){
    if(count>k){
      return;
    }
    if(count<k && target==0){
      ans.add(new ArrayList<>(output));
      return;
    }
    if(target<0){
      return ;
    }
    if(index>=candidates.length){
      return;
    }
    output.add(candidates[index]);
    solve(candidates, target-candidates[index], index+1, ans, output, count+1, k);
    output.remove(output.size()-1);
    while(index+1<candidates.length && candidates[index]==candidates[index+1]){
      index++;
    }
    solve(candidates, target, index+1, ans, output, count, k);
  }
  public static List<List<Integer>> combinationSum(int k,int n){
    List<List<Integer>> ans= new ArrayList<>();
    List<Integer> output = new ArrayList<>();
    int candidates[]={1,2,3,4,5,6,7,8,9};
    int target=n;
    int count=0;
    int index=0;
    solve(candidates,target,index,ans,output,count,k);
    return ans;
  }
  public static void main(String[] args) {
    int k = 3;
    int n = 7;
    List<List<Integer>> answer=combinationSum(k,n);
    System.out.println(answer);
  }
}
