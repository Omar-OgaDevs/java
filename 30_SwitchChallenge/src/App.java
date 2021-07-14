/*
Create a new switch statement using char instead of int
Create a new char variable
Create a switch statement testing for
A,B,C,D or E
Display a message if any of these are found and then break
Add a default which displays a message saying not found
*/

public class App {
    public static void main(String[] args) throws Exception {     
    
        String letter = "C";

    switch (letter.toLowerCase()) {
        case "a": case "b": case "c": case "d": case "e":
        System.out.println(letter + " was found!");            
        break;
    
        default:
        System.out.println("not found");            
            break;
    
    }
    
    }
}
