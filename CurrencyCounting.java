import java.util.Scanner;

public class CurrencyCounting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        int note100 = 0, note50 = 0, note20 = 0, note10 = 0;

        while (amount > 0) {
            switch (amount) {
                case 100:
                    note100++;
                    amount -= 100;
                    break;

                case 50:
                    note50++;
                    amount -= 50;
                    break;

                case 20:
                    note20++;
                    amount -= 20;
                    break;

                default:
                if (amount >= 10){
                    note10++;
                    amount -= 1;
                    break;
                }
                    
            }
        }

        System.out.println("Number of 100/- notes: " + note100);
        System.out.println("Number of 50/- notes: " + note50);
        System.out.println("Number of 20/- notes: " + note20);
        System.out.println("Number of 10/- notes: " + note10);

        scanner.close();
    }
}
