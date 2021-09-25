package Question_2;
import java.time.LocalDate;
public class Account
{
    int accountNumber;
    String accountHolderName;
    LocalDate openedDate;
    double balance;

    public Account(int accountNumber, String accountHolderName, LocalDate openedDate, double balance) 
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.openedDate = openedDate;
        this.balance = balance;
    }

    public int getAccountNumber() 
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName()
    {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName)
    {
        this.accountHolderName = accountHolderName;
    }

    public LocalDate getOpenedDate() 
    {
        return openedDate;
    }

    public void setOpenedDate(LocalDate openedDate) 
    {
        this.openedDate = openedDate;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public double addAmount(double amt) 
    {
        balance += amt;
        return balance;
    }

    public double subAmount(double amt) 
    {
        balance -= amt;
        return balance;
    }

    public boolean check(double amount) 
    {
        return !(balance - amount < 5000);
    }
}

    






