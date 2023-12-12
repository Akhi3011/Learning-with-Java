public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int n = 10; // You can set any specific value for n
        int i = 2;

        while (i <= n) {
            sum = sum + i;
            i = i + 2;
        }

        System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);
    }

}
