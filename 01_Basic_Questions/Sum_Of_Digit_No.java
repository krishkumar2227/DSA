import java.util.*;
public class Sum_Of_Digit_No {
static void sumDigit(int n ){
  int sum = 0;
  while(n!=0){
    int digit = n % 10;
    sum = sum + digit;
    n = n/10;
  }
  System.out.println(sum);
}
  public static void main(String[] args) {
    System.out.println("Enter no. to print sum of digit:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sumDigit(n);

  }
}
