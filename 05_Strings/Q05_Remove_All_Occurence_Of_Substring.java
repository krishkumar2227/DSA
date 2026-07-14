public class Q05_Remove_All_Occurence_Of_Substring {
  static public String removeOccurenceSubstring(String s , String part){
      while(s.contains(part)){
        int index=s.indexOf(part);
        s=s.substring(0,index)+s.substring(index+part.length());
      }
    return s;
  }
  public static void main(String[] args) {
    String s="ababcab";
    String part="ab";
    String ans=removeOccurenceSubstring(s, part);
    System.out.println(ans);
  }
}
