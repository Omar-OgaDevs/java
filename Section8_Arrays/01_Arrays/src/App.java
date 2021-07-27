/*
Array is a data structure to enables you to store a sequence of
values of the same type
*/
public class App {
    public static void main(String[] args) throws Exception {
        //Defining array myIntArray with 10 elements
        int[] myIntArray = new int[9];
        //Saving the value 50 in position #6
        myIntArray[5]=50;
        
        //Defining array myDoubleArray with 10 elements
        double[] myDoubleArray = new double[9];
        //Retrieve the value of a particular element
        System.out.println("Array1");
        System.out.println(myIntArray[5]);

        System.out.println("Array2");

        //Defining array elements in the variable
        int[] myIntArray2 = {11,22,33,44,55,66,77,88,99,21};
        System.out.println(myIntArray2[0]);
        System.out.println(myIntArray2[5]);
        System.out.println(myIntArray2[9]);

        //Initialize an array with a loop
        System.out.println("Initialize an array with a loop");
        int[] myIntArray3 = new int[10];
        for(int i=0; i<myIntArray3.length; i++){
            myIntArray3[i] = i*10;
        }
        //Printing out the values of the array
        for(int i=0; i<myIntArray3.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray3[i]);
        }
        //Method on an array with a loop
        System.out.println("Method on an array with a loop");
        int[] myIntArray4 = new int[10];
        for(int i=0; i<myIntArray4.length; i++){
            myIntArray4[i] = i*10;
        }
        //Call the method for printing an array
        printArray(myIntArray4);
    }
    //Method for printing an array
    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
