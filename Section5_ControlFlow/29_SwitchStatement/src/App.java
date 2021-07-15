import javax.swing.text.AbstractDocument.BranchElement;

public class App {
    public static void main(String[] args) throws Exception {
        
        int value = 3;

        if(value == 1) {
            System.out.println("Value is 1");
        } else if(value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Value is not 1 or 2");
        }

        //using the switch statement

        int switchValue = 6;

        switch(switchValue) {
            case 1:
            System.out.println("Value is 1");
            break;

            case 2:
            System.out.println("Value is 2");
            break;

            case 3: case 4: case 5:            
            System.out.println("Value is " + switchValue);
            break;

            default:
            System.out.println("Value is not 1 to 5");
            break;
        }
    }
}
