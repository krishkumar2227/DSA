public class Q09_Valid_Palindrome {
  public void reverseString(char[] arr,int m){
        int start=0;
        int end=m-1;
        while(start<=end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
    public boolean isPalindrome(String s) {
        int n = s.length();
        if(n ==0){
            return true;
        }
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        char [] arr=s.toCharArray();
        int m = arr.length;
        reverseString(arr,m);
        
        String reversed=new String(arr);
        if(s.equals(reversed)){
            return true;
        }
    return false;
    }
}
