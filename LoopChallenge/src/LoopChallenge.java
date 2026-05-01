public class LoopChallenge {

    public static void main(String[] args) {

        primeCounter();

    }

    public static boolean isPrime(int wholeNumber) {

        boolean result = false;

        if (wholeNumber <= 2) {
            return wholeNumber == 2;
        }

        for (int divisor = 2; divisor < wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void primeCounter() {
        int count = 0;

        for (int num = 10; count < 3 && num <= 50; num++) {
            if (isPrime(num)) {
                System.out.println(num + " is a prime number");
                count += 1;
            }
        }
    }
}
