//1. Create a double variable with a value of 20.00
//2. Create a second variable of type double with the value of 80.00
//3. Add both numbers together and multiply by 100.00
//4. Use the remainder operator to figure out what the remainder from 
//the result of the operation in step 3 and 40.00
//We used the modulus of remainder operator on ints in the course,
//but we can also use it on a double.
//5. Create a boolean variable that assigns the value true if the
//remainder in #4 is 0, or false if its not zero.
//6. Output the boolean variable
//7. Write an if-then statement that displays a message
//"Got some remainder" if the boolean in step 5 is not true.
//Don't be surprised if you see output for this step, where
//you might expect it not to show.

public class App {
    public static void main(String[] args) throws Exception {
        
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);

        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("TheRemainder = " + theRemainder);

        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("IsNoRemainder = " + isNoRemainder);

        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }

    }
}
