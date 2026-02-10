import java.util.Arrays;
public class F_RImage {
    public static void main(String[] args) {
        int [][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(ans));

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int [][]ans = new int[n][n];
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<n ; j++){
                ans[i][j] = image[i][n-1-j]; //for flipping

                if(ans[i][j] == 0){ //for reversing
                    ans[i][j] = 0;
                }
                else {
                    ans[i][j] = 1;
                }
            }
        }
        return ans;

    }
}
