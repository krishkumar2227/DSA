import java.util.Scanner;

public class Palindrome_No {
  static void palindromeNo(int n ){
    int original=n;
    int rev=0;
    while(n!=0){
      int digit=n% 10;
      rev= rev *10 + digit;
      n = n /10;
    }
    if(original==rev){
      System.out.println("It is palindrome number..");
    } else{
      System.out.println("It is not a palindrome number..");
    }
  }
  public static void main(String[] args) {
    System.out.println("Enter Number to check Palindrome:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    palindromeNo(n);
  }
}
