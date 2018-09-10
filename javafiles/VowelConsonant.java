import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {

        String wordChecker;

        Scanner word = new Scanner(System.in);
        System.out.println("Enter your word here: ");
        wordChecker = word.next();

        int wordLength = wordChecker.length();

        for (int i=0; i<= wordLength-1; i++ ) {
            if ( wordChecker.charAt(i) == 'a' || wordChecker.charAt(i) == 'e' || wordChecker.charAt(i) == 'i' || wordChecker.charAt(i)== 'o' ||
                wordChecker.charAt(i)== 'u' ) {
                System.out.println("vowel ");
            }
            else {
                System.out.println("consonant ");
            }
        }
    }
}