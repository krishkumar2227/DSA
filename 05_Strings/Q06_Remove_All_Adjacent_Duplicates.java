public class Q06_Remove_All_Adjacent_Duplicates {
  static public String removeAdjacent(String s){
     StringBuilder ans=new StringBuilder();
     for(int i =0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ans.length()>0 && ans.charAt(ans.length()-1)==ch){
           ans.deleteCharAt(ans.length()-1);
        }else{
          ans.append(ch);
        }
     }
    return ans.toString();
  }
  public static void main(String[] args) {
    String s ="azxxzy";
    String ans=removeAdjacent(s);
    System.out.println(ans);
  }
}
