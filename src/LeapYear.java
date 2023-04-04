  // Two methods to check if the year is a leap year and gives us days of the specific month
  //test all conditions


public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2016));
        System.out.println(getDaysInMonth(2,2004));

    }

    public static boolean isLeapYear(int year) {
        if(year<= 0 || year>9999){
            return false;
        }
        else if (year % 4 != 0 ) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;

        }
    }
    public static int getDaysInMonth(int month, int year){
       if(year<0 || year >=9999 || month<1 || month >12) {
           return -1;
       }
        int daysInTheMonth;
        switch (month){
            case 2:if(isLeapYear(year)){
                daysInTheMonth=29;
            } else {
                daysInTheMonth=28;
            }
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInTheMonth=30;
                break;
            default:
                daysInTheMonth=31;
                break;
        }
        return daysInTheMonth;
    }
}
