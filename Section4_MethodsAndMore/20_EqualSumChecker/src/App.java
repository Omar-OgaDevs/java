public class App {
    public static void main(String[] args) throws Exception {
        
        hasEqualSum(2, 3, 4);
	    hasEqualSum(2, 2, 4);
    }

    public static boolean hasEqualSum (int firstNumber, int secondNumber, int thirdNumber) {
        if((firstNumber + secondNumber) == thirdNumber) {
            System.out.println("The sums are equal");
            return true;
        } else {
            return false;
        }
    }
}
