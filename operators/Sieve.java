package operators;
import java.util.*;

public class Sieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean[] arr = new boolean[n+1];
        seive(n, arr);
    }
    static void seive(int n , boolean[] arr){
        for(int i = 2 ; i * i <= n; i++){
            if(arr[i] == false){
                for(int j = i*2; j <= n ; j+=i){
                    arr[j] = true;
                }
            }git
        }
        for(int i = 2; i<=n ; i++){
            if(!arr[i])
            System.out.print(i + " ");
        }
    }
}
