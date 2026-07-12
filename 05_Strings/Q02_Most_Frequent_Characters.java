public class Q02_Most_Frequent_Characters {
  static public char getMaxOccuringChar(String s) {
         int[] freq=new int[26];
         int maxFreq=-1;
         
         for(int i =0;i<s.length();i++){
            char currChar= s.charAt(i);
            freq[currChar-'a']++;
         }
         char ans='a';
         for(int i =0;i<26;i++){
             if(freq[i]> maxFreq){
                 maxFreq=freq[i];
                 ans=(char)(i+'a');
             }
         }
        return ans;
    }
  public static void main(String[] args) {
    String s = "testsample";
    char ans=getMaxOccuringChar(s);
    System.out.println(ans);
  }
}

