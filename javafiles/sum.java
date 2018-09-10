import java.lang.*;
import java.util.Scanner;

public class sum {
    public static void main(String args[]) {

        try{
            System.out.println("Enter your number her: ");    // Taking Input
            Scanner input = new Scanner(System.in);
            String word;
            word = input.nextLine();

            int l;
            int sum = 0;

            l = word.length();

            String strarray[] = word.split(" ");
            int intarray[] = new int[strarray.length];

            for (int i = 0; i < intarray.length; i++) {
                intarray[i] = Integer.parseInt(strarray[i]);
            }

            for (int j = 0; j < intarray.length; j++) {
                sum = sum + intarray[j];
            }
            System.out.println(sum);
        }
        catch(Exception e)
        {
            System.out.println("Please enter correct input");
        }
    }
}