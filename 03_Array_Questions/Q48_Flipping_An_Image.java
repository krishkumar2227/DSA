public class Q48_Flipping_An_Image {
  class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int m = image.length;
        int k = image[0].length;

        for(int i = 0 ;i<m;i++){
            for(int j =0;j<k;j++){
                if(image[i][j]==1){
                    image[i][j]=0;
                }else{
                    image[i][j]=1;
                }
            }
        }

        for(int i = 0;i<m;i++){
            int startCol = 0;
            int endCol = k-1;
            while(startCol<endCol){
                int temp=image[i][startCol];
                image[i][startCol]=image[i][endCol];
                image[i][endCol]=temp;

                startCol++;
                endCol--;
            }
        }
    return image;
    }
}
}
