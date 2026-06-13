//package 01_Basic_Questions;
import java.util.*;
public class Print_digit_Of_No {
  static void printdigits(int n ){
    while(n!=0){
      int digit=n%10;
      System.out.println(digit);
      n=n/10;
    }
  }
  public static void main(String[] args) {
     System.out.println("Enter number to print digits:");
     Scanner sc = new Scanner(System.in);
     int digit = sc.nextInt();
     printdigits(digit);
    }
}
