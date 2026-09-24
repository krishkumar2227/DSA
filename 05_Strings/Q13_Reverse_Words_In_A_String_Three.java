public class Q13_Reverse_Words_In_A_String_Three {
      public String reverseWords(String s) {
        int n = s.length();
        int i = 0;
        StringBuilder ans = new StringBuilder();
        while(i<n){
            int j = i;
            while( j < n && s.charAt(j)!=' '){
                j++;
            }
            for(int a = j-1;a >=i;a--){
                ans.append(s.charAt(a));
            }
            if(j<n){
                ans.append(' ');
            }
            i=j+1;
        }
    return ans.toString();
    }
}
