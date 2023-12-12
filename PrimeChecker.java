public class PrimeChecker {
    public static void main(String[] args) {
        int number = 96;

        System.out.println(number + (isPrime(number) ? " is " : " is not ") + " a prime number ");

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;

        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                return false;
            }

        }
        return true;
    }

}
