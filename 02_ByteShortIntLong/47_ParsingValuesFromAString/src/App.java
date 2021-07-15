public class App {
    public static void main(String[] args) throws Exception {
        
        String numberAsString = "2021";
        System.out.println("numberAsString = " + numberAsString);

        int number =  Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
