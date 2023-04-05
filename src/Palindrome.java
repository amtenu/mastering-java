public class Palindrome {

    public static void main(String[] args) {
        System.out.println(
                isPalindrome(123321)
        );

    }


    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        if ( number < 10) {
            return true;
        }

        int reversedNumber = 0;
        int originalNumber=number;//copy the number
        while (number != 0) {
            int remainder=number % 10;
            reversedNumber =(reversedNumber *10) + remainder;//Make the remainder in the 10th digit
            number = number / 10;//since number  is int the decimal points are ignored
        }
        return (originalNumber == reversedNumber);


    }

}



