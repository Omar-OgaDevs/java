//If Then Statement

//The if then statement is the most basic of all the control
//flow statements. It tells your program to execute a certain
//section of code only if a particular test evaluates to true.
//This known as a conditional logic.

//Conditional logic uses specific statements in Java to allow
//us to check a condition and execute certain code based
//on whether that condition (the expression) is true or false.

//A code block allows more than one statement to be
//executed:
//if (expression){
    //put one or more statements here
//}

//The ternary operator is a shortcut to assigning one of two values
//to a variable depending on a given condition.
//It's a shortcut of the if-then-else statement.

public class App {
    public static void main(String[] args) throws Exception {
        
        boolean isAlien = false;
        if (isAlien == false){
        System.out.println("It is not an alien!");
        System.out.println("And I am scared of aliens!");
        }

        int topScore = 80;
        if(topScore <100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 82;
        if ((topScore > secondTopScore) && (topScore <100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore < 90)){
            System.out.println("Either or both of the conditions are true");            
        }
        
        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happen");
        }
        
        isCar = true;
        boolean wasCar = isCar ? true : false;        
        if(wasCar){
            System.out.println("wasCar is true");
        }

        int ageClient = 18;
        boolean adult = (ageClient == 20) ? true : false;
        if(adult){
            System.out.println("Approved!");
        }
        else {
            System.out.println("Not Approved :(");
        }
        
    }
}
