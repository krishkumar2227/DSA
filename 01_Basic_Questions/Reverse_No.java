import java.util.Scanner;

public class Reverse_No {
  static void reverseNo(int n ){
    int rev=0;
    while(n!=0){
      int digit=n% 10;
      rev= rev *10 + digit;
      n = n /10;
    }
    System.out.println(rev);
  }
  public static void main(String[] args) {
    System.out.println("Enter Number to reverse digits:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    reverseNo(n);
  }
}
