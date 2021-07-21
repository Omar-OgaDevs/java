/*
Create a new class for a bank account.
Create fields for the account number, balance, customer name, 
email and phone number.
Create getters and setters for each field.
Create two additional methods:
1. To allow the customer to deposit funds(this should increment the balance field).
2. To allow the customer to withdraw funds(this should deduct from the balance field).
but not allow the withdrawal to complete if there are insufficient funds.
You will want to create various code in the Main class to confirm your code is 
working.
Add some System.out.println's in the two methods above as well.
*/


public class App {
    public static void main(String[] args) throws Exception {

        Account evelynAccount = new Account(); //"12345",700.00,"Evelyn Garcia","evelyn@mail.com",//"55-2976-7457");

        System.out.println(evelynAccount.getNumber());
        System.out.println(evelynAccount.getBalance());
                
        evelynAccount.withdrawal(100.0);
        evelynAccount.deposit(50.0);
        evelynAccount.withdrawal(100.0);
        evelynAccount.deposit(51.0);
        evelynAccount.withdrawal(100.0);

        Account omarsAccount = new Account("Omar", "omar@gmail.com", "5529767457");
        System.out.println(omarsAccount.getNumber() + " name " + omarsAccount.getCustomerName());

        /*
        Create a new Class VipCustomer
        It should have 3 fields: name, credit limit,and email address
        Create 3 constructors
        1st constructor empty should call the constructor with 3 parameters with
        default values.
        2nd constructor should pass on the 2 values it receives and add a default 
        value for the 3rd
        3rd constructor should save all fields
        Create getters only for this using code generation as setters wont be
        needed, test and confirm it works.
        */

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Marcela",10000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Victoria", 5000.00, "viky@mail.com");
        System.out.println(person3.getName());

    }
}
