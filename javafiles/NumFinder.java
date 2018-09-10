import java.util.Scanner;

public class NumFinder {

    public static void main(String[] args) {

        int guess = 43;
        int input;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number here:");
            input = sc.nextInt();

            if (input > guess)
                System.out.println("Number guessed is greater than the original number");
            else if (input < guess)
                System.out.println("Number guessed is less than the original number");
            else
                System.out.println("Number guessed matches the original number");
        } while (input != guess);
    }
}