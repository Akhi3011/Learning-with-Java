import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int row = 1;

        while (row <= n) {
            int col = 1;

            while (col <= row) {
                System.out.print("*");
                col = col + 1;
            }

            System.out.println();
            row = row + 1;
        }

        scanner.close();
    }
}
