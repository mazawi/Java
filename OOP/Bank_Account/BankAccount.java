package Bank_Account;

class BankAccount 
{
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance) 
    {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else 
        {
            System.out.println("Insufficient funds");
        }
        
    }
    public void displayBalance() 
    {
        System.out.println("Balance for account holder " + accountHolder + ": " + balance);
    }
}