package recursion;

public class Fact {
    public static void main(String[] args) {
        int ans = Factorial(6);
        System.out.println(ans);

    }
    public static int Factorial(int n ){
        if(n <= 1){
            return 1;
        }
        return n * Factorial(n-1);
    }
}
