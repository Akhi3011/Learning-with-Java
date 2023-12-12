public class Summation {
    public static void main(String[] args) {
        int sum = 0;
        int n = 5; // You can set any specific value for n
        int i = 1;

        while (i <= n) {
            sum = sum + i;
            i = i + 1;
        }

        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
    }
}
