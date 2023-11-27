public class CurrentAccount extends BankAccount{

    @Override
    public void deposit(){
        System.out.println("This is deposint method from Current Accont class");
    }

    @Override
    public void withdraw(){
        System.out.println("This is withdraw method from Current Accont class");
    }
}
