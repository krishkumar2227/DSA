import java.util.*;
public class Greatest_Common_Divisor {
  static void gcd(int a,int b){
    while(b!=0){
      int temp=b;
      b=a%b;
      a=temp;
    }
    System.out.println("The greatest common divisor of two numbers is:"+a);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number:");
    int a= sc.nextInt();
    System.out.println("Enter second number:");
    int b=sc.nextInt();
    
    gcd(a, b);
  }
}
