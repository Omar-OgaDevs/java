public class Monitor {

  private String brand;
  private String model;
  private int size;
  private Resolution nativeResolution;

  public Monitor(String brand, String model, int size, Resolution nativeResolution) {
    this.brand = brand;
    this.model = model;
    this.size = size;
    this.nativeResolution = nativeResolution;
  }

  public void drawPixelAt(int x, int y, String color)  {
    System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
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

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public Resolution getNativeResolution() {
    return nativeResolution;
  }

  public void setNativeResolution(Resolution nativeResolution) {
    this.nativeResolution = nativeResolution;
  } 
  
}
