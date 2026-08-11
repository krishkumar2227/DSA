import java.util.*;
public class Q17_Letter_Combinations_Of_Phone_Number {
  public static void solve(String digits,int index,String[]mapping,List<String>result,StringBuilder output){
    if(index>=digits.length()){
      result.add(output.toString());
      return;
    }
    int value=digits.charAt(index) -'0';
    String mappedString=mapping[value];
    for(int i=0;i<mappedString.length();i++){
         output.append(mappedString.charAt(index));
         solve(digits, index+1, mapping, result, output);
         output.deleteCharAt(output.length()-1);
    }
  }
  public static List<String> letterCombinations(String digits){
     String[] mappping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     List<String>result=new ArrayList<>();
     int index=0;
     StringBuilder output=new StringBuilder();
     solve(digits,index,mappping,result,output);
     return result;
  }
  public static void main(String[] args) {
    String digits="56";
    List<String> answer=new ArrayList<>();
    answer=letterCombinations(digits);
    System.out.println(answer);
  }
}
