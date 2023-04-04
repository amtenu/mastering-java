
//check if a whole number is prime or not

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(11));
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
