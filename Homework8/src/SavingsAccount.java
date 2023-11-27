public class SavingsAccount extends BankAccount {

    @Override
    public void deposit(){
        System.out.println("This is deposit method in Savin account class");
    }

    @Override
    public void withdraw() {
        System.out.println("This is withdraw method in Saving account class");
    }

}
