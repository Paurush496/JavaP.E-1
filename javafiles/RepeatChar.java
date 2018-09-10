import java.util.Scanner;

class RepeatChar {

    public static String RepeatChar(String word, int x) {

        try {
            String finaloutput = "";
            int l = word.length();
            for (int i = 0; i < l - x; i++) {
                System.out.print(word.charAt(i));
                finaloutput = finaloutput + word.charAt(i) + "";
            }
            for (int i = 0; i < x + 1; i++) {
                for (int j = l - x; j < l; j++) {
                    System.out.print(word.charAt(j));
                    finaloutput = finaloutput + word.charAt(j) + "";
                }
            }
            finaloutput = finaloutput.trim();
            return finaloutput;
        }
        catch(Exception e)
        {
            System.out.println("Invalid input");
            return "Invalid input";
        }
    }
}