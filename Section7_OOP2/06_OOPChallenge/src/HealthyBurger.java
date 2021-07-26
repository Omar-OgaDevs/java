public class HealthyBurger extends Hamburger{
  
  //Adding 2 fields to this healthy class
  private String healthyExtra1Name;
  private double healthyExtra1Price;  

  private String healthyExtra2Name;
  private double healthyExtra2Price;
  
  //Constructor
  public HealthyBurger(String meat, double price) {
    super("Healthy", meat, price, "Brown rye");
  }
  //for the two additions
  public void addHealthyAddition1(String name, double price)   {
    this.healthyExtra1Name = name;
    this.healthyExtra1Price = price;
  }
  public void addHealthyAddition2(String name, double price)   {
    this.healthyExtra2Name = name;
    this.healthyExtra2Price = price;
  }
  //method to add the cost of the additionals
  @Override
  public double itemizeHamburger() {    
    double hamburgerPrice = super.itemizeHamburger();
    if(this.healthyExtra1Name != null) {
      hamburgerPrice += this.healthyExtra1Price;
      System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
    }
    if(this.healthyExtra2Name != null) {
      hamburgerPrice += this.healthyExtra2Price;
      System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
    }
    return hamburgerPrice;
  }
  
}
