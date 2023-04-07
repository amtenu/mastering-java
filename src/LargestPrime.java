public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(24));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        int largestPrime = 0;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                largestPrime = i;
            }
            while (number % i == 0) {
                number /= i;
            }
        }

        return largestPrime;


    }
}

