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

    }
}
