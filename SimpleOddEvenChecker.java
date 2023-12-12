import java.util.Scanner;

public class SimpleOddEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println(number + " is " + (number % 2 == 0 ? "even" : "odd"));

        scanner.close();

    }

}
