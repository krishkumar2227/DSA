public class Hollow_Rectangle {
  public static void main(String[] args) {
    int n = 4;
    for(int i = 1 ;i<=n;i++){
      for(int j =1;j<=6;j++){
        if(i==1 || i==4){
          System.out.print("*");
        } else{
          if(j==1){
            System.out.print("*");
          }else if(j==6){
            System.out.print("*");
          }else{
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}
