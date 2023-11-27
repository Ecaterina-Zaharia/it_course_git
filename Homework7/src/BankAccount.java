public class BankAccount {

    private double userBalance;

    public BankAccount(double userBalance) {
        this.userBalance = userBalance;
    }

    public void deposit(double amount) {
        userBalance += amount;

    }

    public void withdraw(double amount) {
        if (userBalance >= amount){
            userBalance -=amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(double userBalance) {
        this.userBalance = userBalance;
    }
}
