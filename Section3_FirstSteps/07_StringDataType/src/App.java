        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        // The String is a datatype in java, which is not a primitive type.
        // It's actually a Class, but it enjoys a bit of favoritism in Java
        // to make it easier to use than a regular class.

        // A String is a sequence of characters, it can contain a large number
        // of characters; Technically it's limited by memory or the 
        // MAX_VALUE of an int which was 2.14 Billion.

public class App {
    public static void main(String[] args) throws Exception {

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this more";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 OGADevs 2021";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);
    }
}
