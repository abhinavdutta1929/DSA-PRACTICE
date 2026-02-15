package pattern;

public class Main {
    public static void main(String[] args) {
        pattern17(5);

    }

    static void  pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            for(int col = 1 ; col<= n ; col++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
    static void parttern2(int n){
        for(int row = 1 ; row <=n ; row++){
            for(int col = 1; col<= row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern3(int n){
        for(int row = 1; row <= n ; row++){
            for(int col = n ; col >= row ; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row = 1 ; row<= n ; row++){
            for(int col = 1 ; col <= row ; col++){
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row = 1 ; row < (2*n -1)+1; row++){
            int totalcolsInRow = row > n ? 2*n- row: row;
            for(int col = 1 ; col <= totalcolsInRow ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for(int row = 1 ; row < (2*n -1)+1; row++){
            int totalcolsInRow = row > n ? 2*n- row: row;
            int noOfSpaces = n-totalcolsInRow;
            for(int i = 1 ; i <= noOfSpaces ; i++){
                System.out.print(" ");
            }
            for(int col = 1 ; col <= totalcolsInRow ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n ){
        for(int row = 1 ; row <= n ; row++){
            for (int space = 1 ; space <= n - row ; space++){
                System.out.print("  ");
            }
            for(int col = row ; col >= 1 ; col--){
                System.out.print(col + " ");
            }
            for(int col = 2 ; col <= row ; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n ){
        for(int row = 1 ; row <= 2*n -1 ; row++){
            int c = row > n ? 2*n- row: row;
            for (int space = 1 ; space <= n - c ; space++){
                System.out.print("  ");
            }
            for(int col = row ; col >= 1 ; col--){
                System.out.print(col + " ");
            }
            for(int col = 2 ; col <= c ; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
