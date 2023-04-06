import java.util.Arrays;

public class SumEvenDigits {
    public static void main(String[] args) {
        System.out.println(sumEvenDigits(1234));


    }

    public static int sumEvenDigits(int number) {
        if (number < 0) {
            return -1;
        }
        String myStringNumber;
        myStringNumber = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < myStringNumber.length() ; i++) {
            int digit = Character.getNumericValue(myStringNumber.charAt(i));
            if ((digit) % 2 == 0)
                sum += digit;
        }
        return sum;
    }

}
