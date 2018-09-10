import java.lang.*;
import java.util.Scanner;

public class wordCaseIdentifier {

    public static void main(String args[]) {

        char ch;
        System.out.println("Enter the character : ");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt( 0 );

        if ( ch >= 65 && ch <= 90 ) {
            System.out.println("Entered character is an uppercase alphabet");}

        else if ( ch >= 97 && ch <= 122 ){
            System.out.println("Entered character is a lowercase alphabet");}

        else if ( ch >= 48 && ch <= 57 ){
            System.out.println("Entered character is a number");}

        else if (( ch > 0 && ch <= 47 )||(ch >= 58 && ch <= 64 )|| ( ch >= 91 && ch <= 96 )||
                (ch >= 123 && ch <= 127 )){

            System.out.println("Entered character is a special symbol");}
    }
}