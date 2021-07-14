/*
Create a for statement using any range of numbers
Determine if the number is a prime number using the isPrime method
if it is a prime number, print it out AND increment a count of the
number of prime numbers found
If that count is 3 exit the for loop
hint: Use the break; statement to exit
*/

public class App {
    public static void main(String[] args) throws Exception {  
        
        int count = 0;
        for(int i = 10; i < 50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 11) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
