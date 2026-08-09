import java.util.*;
public class Q15_Permutation_In_String {
  public static void solve(String s ,String output,ArrayList<String> ans){
    if(s.isEmpty()){
      ans.add(output);
      return;
    }
    for(int i =0;i<s.length();i++){
      char ch = s.charAt(i);
      String remString=s.substring(0,i)+s.substring(i+1);
      solve(remString,output+ch,ans);
    }
  }
  public static ArrayList<String> permutationInString(String s){
     ArrayList<String> ans=new ArrayList<>();
     solve(s,"",ans);
     return ans;
  }
  public static void main(String[] args) {
    String s ="abc";
    ArrayList<String> answer=permutationInString(s);
    System.out.println(answer);
  }
}
