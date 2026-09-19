public class Q10_Valid_Parenthesis {
    public static boolean validParenthesis(String s){
        while (s.contains("()") ||
               s.contains("{}") ||
               s.contains("[]")) {

            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.length() == 0;
    }
  public static void main(String[]args){
    String s = "({[]})";
    boolean ans=validParenthesis(s);
    System.out.println(ans);
  }
}
