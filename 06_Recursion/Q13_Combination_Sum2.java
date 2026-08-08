import java.util.*;
public class Q13_Combination_Sum2 {
  public static void solve(int []candidates,int target,int index,List<List<Integer>>ans,List<Integer>output){
    if(target==0){
      ans.add(new ArrayList<>(output));
      return;
    }
    if(index>=candidates.length){
       return;
    }
    if(target<0){
      return;
    }
    output.add(candidates[index]);
    solve(candidates,target-candidates[index],index+1,ans,output);

    output.remove(output.size()-1);
    while(index+1<candidates.length && candidates[index]==candidates[index+1]){
      index++;
    }
    solve(candidates, target, index+1, ans, output);
  }
  public static List<List<Integer>> combinationSum2(int[] candidates,int target){
     List<List<Integer>> ans=new ArrayList<>();
     List<Integer> output=new ArrayList<>();
     int index=0;
     solve(candidates,target,index, ans, output);
     return ans;

  }
  public static void main(String[] args) {
    int candidates[]={10,1,2,7,6,1,5};
    int target=8;
    List<List<Integer>> answer=combinationSum2(candidates, target);
    System.out.println(answer);
  }
}
