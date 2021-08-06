public abstract class Animal {

  private String name;

  //Constructor
  public Animal(String name) {
    this.name = name;
  }
  
  //Abstract eat method
  public abstract void eat();
  public abstract void breathe();

  //Getter
  public String getName() {
    return name;
  }
  
}
