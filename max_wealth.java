//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package array;

public class max_wealth {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3, 2, 5}, {3, 8, 5}, {2, 9, 2}};
        System.out.println("The max wealth is : " + wealth(arr));
    }

    static int wealth(int[][] arr) {
        int ans = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; ++i) {
            int sum = 0;

            for(int j = 0; j < arr[i].length; ++j) {
                sum += arr[i][j];
            }

            if (sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }
}
