//Convert a given number of pounds to kilograms

//1. Create a variable with the appropiate type to store the number of pounds to be converted to kilograms.
//2. Calculate the result i.e., the number of kilograms based on the contents of the variable above and store the result in a 2nd appropiate variable.
//3. Print out the result.
// 1 pound is equal to 0.45359237 of a kilogram.

public class App {
    public static void main(String[] args) throws Exception {
        
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms = " + convertedKilograms);
    }
}
