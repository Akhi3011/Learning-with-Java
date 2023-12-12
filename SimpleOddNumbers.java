import java.util.Scanner;

public class SimpleOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting number");
        int start = scanner.nextInt();

        System.out.println("Enter the ending number");
        int end = scanner.nextInt();

        System.out.println("Odd numbers between " + start + " and " + end + " (inclusive):");
        for (int i = start; i <= end; i += 2) {
            System.out.println(i);
        }

        scanner.close();

    }

}
