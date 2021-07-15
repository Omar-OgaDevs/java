public class App {
    public static void main(String[] args) throws Exception {
        
        int count = 1;
        while(count != 6) {
            System.out.println("Count Value is " + count);
            count++;
        }    

        count = 1;
        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count Value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count Value is " + count);
            count++;

            if(count > 100) {
                break;
            }

        } while(count != 6);

       /*      
        //Using for loop
        System.out.println("Using for loop:");
        for(count = 1; count !=6; count++) {
            System.out.println("Count Value is " + count);
        }
        */

    }
}
