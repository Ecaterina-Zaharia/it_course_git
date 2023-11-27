public class SavingsAccount extends BankAccount {


    public SavingsAccount(double userBalance) {
        super(userBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (getUserBalance() - amount < 100){
            System.out.println("Minimum balance of $100 required!");
        } else {
            super.withdraw(amount);
        }
    }
}