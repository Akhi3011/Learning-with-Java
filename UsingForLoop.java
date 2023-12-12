import java.util.Scanner;

public class UsingForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");

        int n = scanner.nextInt();

        System.out.println("Printing count from 1 to n: ");

        // for (int i = 1; i <= n; i++) {
        // System.out.println(i);

        // }

        for (int a = 0, b = 1, c = 2; a >= 0 && b <= 1 && c <= 2; a--, b--, c--) {
            System.out.println(a + " " + b + " " + c);
        }

        scanner.close();

    }

}
