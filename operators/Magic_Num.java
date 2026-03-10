package operators;

public class Magic_Num {
    public static void main(String[] args) {
       int n = 8;
        System.out.println(magicNumber(n));
    }
    public static int magicNumber(int n){
        int power = 1;
        int answer = 0;
        while(n > 0){
            power = power * 5;
            if((n & 1 ) == 1){
                answer += power;
            }
            n = n >> 1;
        }
        return answer;
    }
}
