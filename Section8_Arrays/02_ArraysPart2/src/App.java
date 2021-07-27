import java.util.Scanner;

public class App {
    //Allow input throught the console
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        //Call the method to display the sum average
        System.out.println("The average is " + getAverage(myIntegers));
    }
    //Method for input values into the array
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        //Define the array
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    //Method to calculate the average of the sum of the elements of the array
    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}
