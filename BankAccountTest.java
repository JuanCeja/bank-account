public class BankAccountTest {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount(100.00, 50.00);
        account1.depositMoney(50.0);
        account1.withdrawlMoney(25.00);
        account1.getAllAccountsBalance();

    }
}
