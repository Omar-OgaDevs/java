public class App {
    public static void main(String[] args) throws Exception {
        
        boolean gameOver = true;
        int score = 700;
        int levelCompleted = 5;
        int bonus = 100;

/*         if (score < 4999 && score >= 1000){
            System.out.println("Your score was less than 5000 but greater than 1000");
        }
        else if (score <= 999){
            System.out.println("Your score was less than 1000");
        }
        else {
            System.out.println("Your score was over 5000");
        } */

        //VARIABLES INSIDE A CODE BLOCK IT'S CALLED SCOPE
             
        //if (gameOver == true)
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your Final Score is " + finalScore);
        }

        //Print out a second score on the screen with the following
        //score set to 10000
        //levelCompleted set to 8
        //bonus set to 200
        //but make sure the first printout above still displays as well
        
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your Final Score is " + finalScore);
        }
    }
}