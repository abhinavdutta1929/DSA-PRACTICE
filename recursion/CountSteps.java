package recursion;

public class CountSteps {
    public static void main(String[] args) {
        int num = 122;
        System.out.println(NumberOfSteps(num));

    }
    public static int NumberOfSteps(int sum){
        return helper(sum, 0);
    }
    private static int helper(int num , int steps){
        if(num==0){
            return steps;
        }
        if(num % 2 == 0){
            return helper(num/2 , steps+1);

        }
        return helper(num-1,steps+1);
    }
}
