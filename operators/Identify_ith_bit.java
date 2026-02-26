package operators;

public class Identify_ith_bit {
    public static void main(String[] args) {
        int[] arr = {8,2,5,6,1,7,8};
        int n = 
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int Ans = 0;
        for(int n : arr){
            Ans &=arr;
        }

        return Ans;
    }
}
