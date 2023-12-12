import java.util.Scanner;

public class DummyMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        dummy(n);

        System.out.println("Number n is " + n);

        scanner.close();
    }

    static void dummy(int n) {
        n++;
        System.out.println("n is " + n);
    }
}
