package recursion;

public class Sumofdigits {
    public static void main(String[] args) {
        int ans = Sum(1321);
        System.out.println(ans);
    }
    public static int Sum(int n ){
        if(n <= 1 ){
            return n ;
        }
        return (n%10) + Sum(n/10);
    }
}
