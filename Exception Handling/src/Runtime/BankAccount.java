package Runtime;

public class BankAccount {
    double balance=5000;
    void withdraw(double amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Not enough money");
        }
        System.out.println("Withdraw Sucessful");
    }
}
