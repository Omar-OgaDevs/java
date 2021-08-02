import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //Value types
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("Value Types");
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        //Reference types
        //A reference holds a reference or an address to the object
        //but not the object itself.
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("Reference Types");
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        //Create a new object in memory
        anotherArray = new int[]{4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("Method Reference Type");
        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));
    }
    //Method reference types
    private static void modifyArray(int[] array) {

        array[0] = 2;
        //Dereference the reference
        array = new int[]{1,2,3,4,5};
    }
}
