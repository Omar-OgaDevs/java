public class Motherboard {

  private String brand;
  private String model;
  private int ramSlots;
  private int cardSlots;
  private String bios;

  public Motherboard(String brand, String model, int ramSlots, int cardSlots, String bios) {
    this.brand = brand;
    this.model = model;
    this.ramSlots = ramSlots;
    this.cardSlots = cardSlots;
    this.bios = bios;
  }

  public void loadProgram(String programName){
    System.out.println("Program " + programName + " is now loaging...");
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

  public int getRamSlots() {
    return ramSlots;
  }

  public void setRamSlots(int ramSlots) {
    this.ramSlots = ramSlots;
  }

  public int getCardSlots() {
    return cardSlots;
  }

  public void setCardSlots(int cardSlots) {
    this.cardSlots = cardSlots;
  }

  public String getBios() {
    return bios;
  }

  public void setBios(String bios) {
    this.bios = bios;
  }    
  
}
