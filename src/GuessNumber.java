import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int k = 5;

        System.out.println("You have " + k + "number of attempts");
        for (int i = 0; i < k; i++) {
            System.out.println("enter your guess");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Congrats you have guessed the number");
                sc.close();
                return;
            } else if (guess < number) {
                System.out.println("The number is greater than " + guess);
            } else {
                System.out.println("The number is less than" + guess);
            }

        }
        System.out.println("You have exhauseted all the attempts");
        sc.close();

    }
}
