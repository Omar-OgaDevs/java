public class DeluxeBurger extends Hamburger{
  //Default constructor with no parameters
  public DeluxeBurger() {
    super("Deluxe", "Sausage & Bacon", 14.54, "WholeGrain");
    super.addHamburgerAddition1("Chips", 2.75);
    super.addHamburgerAddition2("Drink", 1.81);
  }
  //Prevent these methods to be added
  @Override
  public void addHamburgerAddition1(String name, double price) {    
    System.out.println("Cannot add additional items to a deluxe burger");
  }

  @Override
  public void addHamburgerAddition2(String name, double price) {    
    System.out.println("Cannot add additional items to a deluxe burger");
  }

  @Override
  public void addHamburgerAddition3(String name, double price) {    
    System.out.println("Cannot add additional items to a deluxe burger");super.addHamburgerAddition3(name, price);
  }

  @Override
  public void addHamburgerAddition4(String name, double price) {    
    System.out.println("Cannot add additional items to a deluxe burger");
  }      
}
