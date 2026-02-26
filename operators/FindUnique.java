package operators;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,3,2,5,5,6,7,7};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;
        for(int n = 0 ; n < arr.length; n++){
            unique = unique^arr[n];
        }

        return unique;
    }
}
