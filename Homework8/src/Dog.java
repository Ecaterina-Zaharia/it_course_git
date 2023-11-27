public class Dog implements Mammal{

    @Override
    public void walk(){
        System.out.println("The dog can walk");
    }

    @Override
    public void speak(){
        System.out.println("The dog can speak");
    }
}
