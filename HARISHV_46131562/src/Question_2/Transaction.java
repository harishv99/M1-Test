package Question_2;
import java.time.LocalDate;

class Transaction 
{
    public static double deposit(Account account, double amount)
    {
     
        return account.addAmount(amount);
    }

    public static double withdraw(Account account, double amount) throws InsufficientBalanceException
    {        
        if (account.check(amount)) 
        {
            return account.subAmount(amount);
        } 
        else 
        {
            throw new InsufficientBalanceException("Invalid Balance");
        }
    }

    public static void main(String[] args) throws InsufficientBalanceException 
    {
        Account account = new Account(4036, "HARISH", LocalDate.now(), 6000);
        System.out.println(deposit(account, 1000));
        System.out.println(withdraw(account, 500));
      //System.out.println(withdraw(account, 8000));
  
    }
}

class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String message) 
    {
        super(message);
    }

}