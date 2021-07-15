/*
Using the for statement, call the calculateInterest method with
the amount of 10000 with an interestRate of 2,3,4,5,6,7 and 8
and print the results to the console window.
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00, 2.0));

        for(int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " Hello!");
        }

        for(int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.00, i)));
        }

        System.out.println("******************");

        /*
        How would you modify the for loop above to the same thing as
        shown but to start from 8% and work back to 2%
        */

        for(int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.00, i)));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}
