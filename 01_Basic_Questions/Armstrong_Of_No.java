import java.util.*;
public class Armstrong_Of_No{
  static void armstrong(int n){
    int original=n;
    int sum=0;
    while(n!=0){
      int digit=n%10;
      int cubeOfDigit=digit*digit*digit;
      sum=sum+cubeOfDigit;
      n=n/10;
    }
    if(original==sum){
      System.out.println("It is armstrong number..");
    } else{
      System.out.println("It is not armstrong number..");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number to check it is Armstrong or not:");
    int n = sc.nextInt();
    armstrong(n);
    
  }
}