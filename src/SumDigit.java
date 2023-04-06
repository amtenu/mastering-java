//Method to add all digits of a number
//Mod to take out each digit
//Divide each remaining digits by 10


public class SumDigit {
    public static void main(String[] args) {
        System.out.println(addDigits(-200));
    }

    public static int addDigits(int number){
        if(number<0){
            return -1;
        }
        int sum=0;
       while (number >0){
          sum=sum+(number % 10);
          number =number/10;
       }
       return sum;
    }

}
