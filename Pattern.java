import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int i = 1;
        int count = 1;

        while (i <= n) {
            int j = 1;

            while (j <= n) {
                System.out.print(count + " ");
                count = count + 1;
                j = j + 1;
            }

            System.out.println();
            i = i + 1;
        }

        scanner.close();
    }
}
