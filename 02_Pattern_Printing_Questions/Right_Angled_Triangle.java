//package 02_Pattern_Printing_Questions;

public class Right_Angled_Triangle {
  public static void main(String[] args) {
    int n = 5;
    for(int i=1;i<=n;i++){
      for(int j =1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
}
}