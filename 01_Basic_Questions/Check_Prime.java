import java.util.*;
public class Check_Prime {
  static boolean checkPrime(int n){
    if(n<=1){
      return false;
    }
    for(int i =2;i*i<=n;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    System.out.println("Enter number to check Prime:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(checkPrime(n)){
      System.out.println("Prime number.");
    }else{
      System.out.println("Not Prime number.");
    }
  }
}
