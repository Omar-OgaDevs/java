public class StaticTest {

  private static int numInstances = 0;
  private String name;
  //Constructor
  public StaticTest(String name) {
    this.name = name;
    numInstances++;
  }
  //Getters
  public static int getNumInstances() {
    return numInstances;
  }  
  public String getName() {
    return name;
  }  
}
