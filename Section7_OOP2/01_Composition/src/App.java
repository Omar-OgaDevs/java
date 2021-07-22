public class App {
    public static void main(String[] args) throws Exception {
        Dimensions dimensions = new Dimensions(24, 19, 5);       
        Case theCase = new Case("Alien","Grey777", "700", dimensions);

        Monitor monitor = new Monitor("Viewsonic", "XV24WD", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("Asus", "B560M", 4, 3, "V2.77");

        PC thePC = new PC(theCase, monitor, motherboard);
        thePC.getTheCase().pressPowerButton();
        thePC.getMonitor().drawPixelAt(700, 700, "red");
        thePC.getMotherboard().loadProgram("GNU/Linux Ubuntu 20.4");
    }
}
