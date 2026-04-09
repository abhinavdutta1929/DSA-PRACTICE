package Guess_the_number;
import java.util.*;

public class Game {
    public static void main(String[] args) {
        guess();
    }
    public static void guess(){
        Scanner sc = new Scanner(System.in);
        int number = 1+(int)(100* Math.random());
        int k = 5;
        System.out.println("you have to choose a number between 1 to 100");
        System.out.println("you have " + k +"number of attempts to guess the correct answer");
        for(int n = 0;n<k;n++){
            System.out.println("Enter you guess");
            int guess = sc.nextInt();
            if(guess == number){
                System.out.println("congratulation you have guessed the correct answer");
                sc.close();
                return;
            } else if (guess < number) {
                System.out.println("The number is greater than " + guess);

            }
            else {
                System.out.println("The number is  than less " + guess);
            }

        }
        System.out.println("you have exhusted all the number of attempts . The correct number is  " +number);
        sc.close();

    }
}
