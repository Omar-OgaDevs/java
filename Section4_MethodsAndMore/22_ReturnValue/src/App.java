public class App {
    public static void main(String[] args) throws Exception {
        
        int newScore = calculateScore("Evelyn", 700);
        System.out.println("New score is " + newScore);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 10;
    }
}
