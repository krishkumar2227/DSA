import java.util.*;
public class Power_Of_2 {
  static void powerOf2(int n){
    int count =0;
    while(n!=0){
      if((n&1)!=0){
        count++;
      }
      n = n>>1;
    }
    System.out.println("The bits are present in the number" + count);
    if(count ==1){
      System.out.println("It is  power of 2..");
    }else{
      System.out.println("It is not power of 2");
    }
  }
  public static void main(String[] args) {
      System.out.println("Enter no. to check power of 2:");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      powerOf2(n);
  }
}

