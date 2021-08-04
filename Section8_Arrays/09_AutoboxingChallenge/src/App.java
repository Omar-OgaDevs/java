public class App {
    public static void main(String[] args) throws Exception {
        
        Bank bank = new Bank("National Australian Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Omar", 50.05);
        bank.addCustomer("Adelaide", "Marcela",150.10);
        bank.addCustomer("Adelaide", "Evelyn", 999.99);

        bank.addBranch("Sydney");

        bank.addCustomer("Sydney", "Kenneth", 77.05);
        bank.addCustomer("Sydney", "Kiandra", 1500.75);

        bank.addCustomerTransaction("Adelaide", "Evelyn", 333.00);
        bank.addCustomerTransaction("Adelaide", "Evelyn", 20.00);
        bank.addCustomerTransaction("Adelaide", "Evelyn", 60.00);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);


    }
}
