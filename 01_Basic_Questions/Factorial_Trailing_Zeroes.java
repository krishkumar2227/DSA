public class Factorial_Trailing_Zeroes {
  public static int trailingZeroes(int n){
  int count = 0;

        while (n > 0) {
            n /= 5;
            count += n;
        }

        return count;
    }
    public static void main(String[] args) {
      int n = 10;
      int ans=trailingZeroes(n);
      System.out.println(ans);
    }
}
