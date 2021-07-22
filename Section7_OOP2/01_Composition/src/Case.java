public class Case {

  private String brand;
  private String model;
  private String powerSupply;
  private Dimensions dimensions;

  public Case(String brand, String model, String powerSupply, Dimensions dimensions) {
    this.brand = brand;
    this.model = model;
    this.powerSupply = powerSupply;
    this.dimensions = dimensions;
  }
  
  public void pressPowerButton(){
    System.out.println("Power button pressed");
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getPowerSupply() {
    return powerSupply;
  }

  public void setPowerSupply(String powerSupply) {
    this.powerSupply = powerSupply;
  }

  public Dimensions getDimensions() {
    return dimensions;
  }

  public void setDimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
  }  
  
}
