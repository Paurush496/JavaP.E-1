import java.util.Scanner;

public class TomJerry {

    public static void main(String[] args) {

        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here: ");
        i = sc.nextInt();

        if ( i<20 || i>30) {
            System.out.println("Please enter a number between 20 and 30");
        }

        else if (i%2==0) {
            System.out.println("Jerry");
        }

        else {
            System.out.println("Tom");
        }
    }
}