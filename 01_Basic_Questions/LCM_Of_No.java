import java.util.Scanner;

public class LCM_Of_No {
  static void lcm(int a,int b){
    int x =a;
    int y =b;
    while(y!=0){
      int temp=y;
      y=x%y;
      x=temp;
    }
    System.out.println("The greatest common divisor of two numbers is:"+x);
    int gcd=x;
    int lcm=(a*b)/gcd;
    System.out.println(lcm);

  }
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number:");
    int a= sc.nextInt();
    System.out.println("Enter second number:");
    int b=sc.nextInt();
    lcm(a, b);
 }
} 