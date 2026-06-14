import java.util.*;
public class Count_Digits_Of_No {
  static void countDigit(int n){
    int count=0;
    while(n!=0){
      int digit = n % 10;
      count++;
      n=n/10;
  }
  System.out.println(count);
}
  public static void main(String[] args) {
    System.out.println("Enter Number to count digits:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    countDigit(n);
  }
}