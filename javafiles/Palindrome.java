import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        int sum=0, i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here: ");
        i = sc.nextInt();

        int num = i, x=i;

        while (x > 10) {
            int a, b;
            int n=1;

            a = x % 10;

            while (x >= 10) {
                b = x % 10;
                x = x - b;
                x = x / 10;
                n = n * 10;
            }

            {
                if (a!=x) {
                    System.out.println(i + " is not palindrome.");
                    break;
                } else {
                    x = x * n;
                    i = ((i - x) - a) / 10;
                    x=i;

                    if (a % 2 == 0) {
                        sum = sum + 2*a;
                    }
                }
            }

            if (x<10 && x%2==0) {
                sum = sum +x;

                if (sum>25) {
                    System.out.println(num + " is palindrome and the sum of even numbers is greater than 25.");
                }
                else {
                    System.out.println(num + " is palindrome and the sum of even numbers is less than 25.");
                }
            }

        }

    }
}
