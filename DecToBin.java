import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int ans = 0;

        int i = 0;
        while (n != 0) {

            int bit = n & 1; 
            ans = ans + (bit * (int)Math.pow(10, i));

            n = n / 2; 

            i++;
        }

        System.out.println("Answer is " + ans);

    }
}
