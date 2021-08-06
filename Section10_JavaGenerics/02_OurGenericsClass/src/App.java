public class App {
    public static void main(String[] args) throws Exception {
        
        FootballPlayer omar = new FootballPlayer("Omar");
        BaseballPlayer evelyn = new BaseballPlayer("Evelyn");
        SoccerPlayer jared = new SoccerPlayer("Jared");

        Team<FootballPlayer> manchester = new Team<>("Manchester");
        manchester.addPlayer(omar);
        //manchester.addPlayer(evelyn);
        //manchester.addPlayer(jared);

        System.out.println(manchester.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Dodgers");
        baseballTeam.addPlayer(evelyn);

        Team<SoccerPlayer> brokenTeam = new Team<>("This wont work");
        brokenTeam.addPlayer(jared);
    }
}
