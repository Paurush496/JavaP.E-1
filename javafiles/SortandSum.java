import java.util.Scanner;

public class SortandSum {

    public static void main(String[] args) {

        int p;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        p = sc.nextInt();

        int a[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        while (p != 0) {
            int x = p% 10;
            p = p / 10;
            a[x]++;
        }

        System.out.println("Number arranged in decreasing order : ");
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < a[i]; j++) {
                System.out.print(i);
            }
        }

        int sum = 0;
        System.out.println("Sum of even numbers : ");

        for (int i = 2; i < 9; i = i + 2) {
            sum = sum + i * a[i];
        }

        System.out.println(sum);

        if (sum > 15)
            System.out.println("True");

        else
            System.out.println("False");

    }
}