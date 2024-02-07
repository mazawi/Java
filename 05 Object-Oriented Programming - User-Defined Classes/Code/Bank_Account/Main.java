package Bank_Account;

public class Main 
{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", 1000);
        account1.deposit(500);
        account1.withdraw(200);
        account1.displayBalance();
    }
}
