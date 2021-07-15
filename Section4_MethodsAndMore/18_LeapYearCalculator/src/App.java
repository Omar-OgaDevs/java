public class App {
    public static void main(String[] args) throws Exception {
        
        isLeapYear(-2);
        isLeapYear(1600);
        isLeapYear(2021);
        isLeapYear(2024);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a leap year");
                return true;
            } else {
                System.out.println(year + " is not a leap year");
                return false;
            }
        } else {
            return false;
        }
    }
}
