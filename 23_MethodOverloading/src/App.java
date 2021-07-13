public class App {
    public static void main(String[] args) throws Exception {
        
        int newScore = calculateScore("Evelyn", 700);
        System.out.println("New score is " + newScore);
        
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 10;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 10;
    }

    public static int calculateScore(){
        System.out.println("No player, no score");
        return 0;
    }
}

