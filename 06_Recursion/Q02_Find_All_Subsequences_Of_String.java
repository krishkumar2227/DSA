import java.util.*;
public class Q02_Find_All_Subsequences_Of_String {
   static public void getAllSubsequences(String s,int index,StringBuilder output,List<String> ans){
    if(index>=s.length()){
      String subsequence=output.toString();
      ans.add(subsequence);
      return;
    }
    char ch=s.charAt(index);
    output.append(ch);
    getAllSubsequences(s, index+1, output, ans);

    output.deleteCharAt(output.length()-1);
    getAllSubsequences(s, index+1, output, ans);
   }
   static public   List<String> allSubsequences(String s){
      List<String> ans=new ArrayList<>();
      StringBuilder output=new StringBuilder();

      int index=0;
      getAllSubsequences(s,index,output,ans);
      Collections.sort(ans);
      return ans;
  }
  public static void main(String[] args) {
    System.out.println(allSubsequences("abc"));

  }
}
