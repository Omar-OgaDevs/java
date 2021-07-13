public class App {
    public static void main(String[] args) throws Exception {
        
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        if ((int) (firstNumber * 1000) == (int) (secondNumber * 1000)) {
            System.out.println(firstNumber);
            return true;
        } else {            
            return false;
        }
    }
}
