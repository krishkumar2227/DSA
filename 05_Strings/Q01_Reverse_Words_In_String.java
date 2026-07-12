//package 05_Strings;

public class Q01_Reverse_Words_In_String {
  static public String reverseWords(String s){
    StringBuilder ans= new StringBuilder();
    int i = s.length()-1;
    while(i>=0){
      while(i>0 && s.charAt(i)==' '){
      i--;
    }
    if(i<=0){
      break;
    }
    int j =i;
    while(j>=0 && s.charAt(j)!=' '){
      j--;
    }
    ans.append(s.substring(j+1,i+1));
    while(j>=0 && s.charAt(j)==' '){
      j--;
    }
    if(j>=0){
      ans.append(' ');
    }
    i=j;
    }
    return ans.toString();
  }
  public static void main(String[] args) {
     String s = "My Name Is Krish ";
     String ans=reverseWords(s);
     System.out.println(ans);
  }
}
