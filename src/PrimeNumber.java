// Added method to find and count  primes numbers upto a given number number

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(11));
        DisplayPrimes(100);
    }

    public static void DisplayPrimes(int number) {
        if (number < 2) {
            System.out.println("Invalid Input");
        }

        int myPrimes = 0;
        for (int i = 2; i <= number; i++) {

            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                myPrimes++;
            }
        }
        System.out.println("There are " + myPrimes+ " prime numbers less than "+ number);
    }



    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
//        for (int i = 2; i < number; i++) { //since this is 0(n)
        for(double i=2;i<Math.sqrt(number);i++){//0(sqrt(n))
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
