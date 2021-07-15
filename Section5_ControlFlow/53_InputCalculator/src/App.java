import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int enteredNumbers = 0;
        int sum = 0;

        System.out.println("How many numbers would you like to enter?");
        Scanner scanner = new Scanner(System.in);

        int numbersToEnter = scanner.nextInt();

        while (enteredNumbers < numbersToEnter) {
            int counter = enteredNumbers + 1;
            System.out.println("Enter the number #" + counter);

            boolean isValidInt = scanner.hasNextInt();

            if (isValidInt) {
                int number = scanner.nextInt();
                enteredNumbers++;
                sum += number;
            } else {
                System.out.println("Invalid input.");
            }
            scanner.nextLine(); // handling enter key
        }
        System.out.println("The sum of the " + numbersToEnter + " entered numbers is " + sum + ".");
        scanner.close();
    }
}
