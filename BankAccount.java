public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingBalance;
    public static int numberOfAccounts = 0;
    public static int ammountOfMoney = 0;

    // CONSTRUCTOR
    public BankAccount(double checkingBalance, double savingBalance){
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
        numberOfAccounts++;
        ammountOfMoney += (checkingBalance + savingBalance);
    }
    // METHODS
    public void depositMoney(double ammount){
        this.checkingBalance += ammount;
        System.out.println("After your deposit your new account balance is: " + this.checkingBalance);
    }
    
    public void withdrawlMoney(double ammount){
        if(ammount > getCheckingAccountBalance()){
            System.out.println("Sorry, you don't have enough funds.");
        } else {
            this.checkingBalance -= ammount;
            System.out.println("After your withdrawal your new account balance is: " + this.checkingBalance);
        }
    }

    public void getAllAccountsBalance(){
        double totalBalance = (this.checkingBalance + this.savingBalance);
        System.out.println("Your total balance for both accounts is: " + totalBalance);
    }


    // GETTER AND SETTERS
    public double getCheckingAccountBalance(){
        return this.checkingBalance;
    }
    
    public double getSavingAccountBalance(){
        return this.savingBalance;
    }

}