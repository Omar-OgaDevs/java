/*
Create a method called isEvenNumber that takes a parameter of type int
Its purpose is to determine if the argument passed to the method is
an even number or not.
Return true if an even number, otherwise return false.
*/

public class App {
    public static void main(String[] args) throws Exception {
        
/*         int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number " + number);
        } */
        /*
        Modify the while code above
        Make it also record the total number of even numbers it has found
        and break once 5 numbers are found
        and at the end, display the total number of even numbers found
        */
        int number = 1;
        int finishNumber = 100;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number " + number);

            evenNumbersFound++; //Record evenNumbersFound
            if(evenNumbersFound >= 5) {
                break;
            }            
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0) {
            return true;
        }else {
            return false; 
        }
    }
}
