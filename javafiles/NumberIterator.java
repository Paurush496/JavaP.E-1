import java.util.Scanner;

public class NumberIterator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number here: ");

        int number = input.nextInt();

        for (int i=1; i<=number; i++) {

            for (int j=1; j<=i; j++ ) {
                System.out.println(i+" ");
            }
        }

    }
}
