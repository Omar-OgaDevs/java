import java.util.Scanner;

public class App {
    
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);

        
    }
    
    //Create readIntegers method
    private static int[] readIntegers(int count) {
        //Creates an array and initialize all elements to zero.
        int[] array = new int[count];
        //Make sure users enter only numbers
        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;                        
        }
        return array;
    }
    //Find the minimum value method
    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++) {
            int value = array[i];

            if(value < min) {
                min = value;
            }
        }
        return min;
    }
}
