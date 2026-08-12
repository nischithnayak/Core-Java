package Runtime;

public class BankAccountTest {
    public static void main(String[] args) throws InsufficientBalanceException {
        BankAccount account=new BankAccount();
        account.withdraw(6000);
    }
}
