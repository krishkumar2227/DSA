public class Q14_Reverse_Only_Letter {
  public String reverseOnlyLetters(String s) {
        int n = s.length();
        int left = 0;
        int right=n-1;
        StringBuilder ans= new StringBuilder(s);
        while(left<right){
            if(Character.isLetter(ans.charAt(left)) && Character.isLetter(ans.charAt(right))){
                char temp = ans.charAt(left);
                ans.setCharAt(left, ans.charAt(right));
                ans.setCharAt(right, temp);

                left++;
                right--;
            }else if(!Character.isLetter(ans.charAt(left))){
                left++;
            }else{
                right--;
            }
        }
    return ans.toString();
    }
}
