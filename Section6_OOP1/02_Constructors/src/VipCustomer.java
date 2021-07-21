public class VipCustomer{
  private String name;
  private Double creditLimit;
  private String emailAddress;

  public VipCustomer() {
    this("Default name", 10000.00,"default@email.com");
  }

  public VipCustomer(String name, Double creditLimit) {
    this(name, creditLimit, "unknown@email.com");
  }
  
  public VipCustomer(String name, Double creditLimit, String emailAddress) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.emailAddress = emailAddress;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(Double creditLimit) {
    this.creditLimit = creditLimit;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  } 

  
  
}