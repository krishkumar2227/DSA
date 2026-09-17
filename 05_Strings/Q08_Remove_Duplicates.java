import java.util.HashSet;

public class Q08_Remove_Duplicates {
  class Solution {
    String removeDuplicates(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        StringBuilder ans= new StringBuilder();
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
               set.add(ch);
               ans.append(ch);
            }
        }
    return ans.toString();
    }
  }
}
