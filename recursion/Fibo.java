
package recursion;
import  java.lang.Math.*;


public class Fibo {
    public static void main(String[] args) {
//        int ans = fibo(6);
//        System.out.println("Ans " + ans);
        System.out.println(fiboFormula(40));
    }
    static int fiboFormula(int fibo){
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2),fibo)/Math.sqrt(5));
    }
    static int fibo(int n ){
        if(n < 2 ){
            return n;
        }
        System.out.println(n);
        return fibo(n-1 ) + fibo(n-2 );
    }
}
