//Create a byte variable and set it to any valid byte number,
//Create a short variable and set it to any valid short number,
//Create an int variable and set it to any valid int number,
//Create a long variable and make it equal to 50000 plus 
//10 times the sum of the byte plus the short plus the int values.

public class App {
    public static void main(String[] args) throws Exception {

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue+shortValue+intValue);
        System.out.println(longTotal);

        //Casting short

        short shortTotal = (short)(1000+10*(byteValue+shortValue+intValue));
        System.out.println(shortTotal);
        
    }
}
