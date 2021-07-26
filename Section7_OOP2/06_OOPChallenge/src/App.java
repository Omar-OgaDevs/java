public class App {
    public static void main(String[] args) throws Exception {
        
        //Base constructor
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        //return the price
        double price = hamburger.itemizeHamburger();
        //Adding items
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75 );
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        //Show and recalculate the price
        System.out.println("Total hamburger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);        
        healthyBurger.addHamburgerAddition1("egg", 5.43);        
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();        
        deluxeBurger.addHamburgerAddition3("Should not do this", 1.99);
        deluxeBurger.itemizeHamburger();
    }
}
