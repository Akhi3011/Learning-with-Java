import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        long binary = scanner.nextLong();

        long decimal = 0;
        long base = 1; 

        while (binary != 0) {
            long lastDigit = binary % 10;
            binary /= 10;

            decimal += lastDigit * base;
            base <<= 1; 
        }

        System.out.println("Decimal equivalent: " + decimal);
    }
}
