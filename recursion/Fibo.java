package recursion;

public class Fibo {
    public static void main(String[] args) {
        int ans = fibo(6);
        System.out.println("Ans " + ans);
    }
    static int fibo(int n ){
        if(n < 2 ){
            return n;
        }
        System.out.println(n);
        return fibo(n-1 ) + fibo(n-2 );
    }
}
