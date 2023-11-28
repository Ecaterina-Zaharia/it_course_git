public class Main {
    public static void main(String[] args) {

//In each of these 2 exercises, I would like you to use arrays of abstract types and to iterate through them (use instanceof).
//Try to improve the requirements and make the exercise harder, ask yourself questions. (What if.. How does it work?)
//Use the debugger to identify how the polymorphism works.
//
//1. We shall design a superclass called Monster and define the method attack() in the superclass.
//The subclasses shall then provide their actual implementation.
//In the main program, we declare instances of superclass, substituted with actual subclass; and invoke method defined in the superclass.

        Monster monsterAdam = new MonsterAdam();
        Monster witch = new Witch();


        Monster[] monsters = new Monster[]{monsterAdam, witch};

        for (Monster monster : monsters){
            if(monster instanceof MonsterAdam){
                MonsterAdam innerMonsterAdam = (MonsterAdam) monster;
                innerMonsterAdam.attack();
            } else if (monster instanceof Witch){
                Witch innerWitch = (Witch) monster;
                innerWitch.sayMagicWords();
            }
        }
        //2. Shape is an abstract class containing 2 abstract methods: getArea() and getPerimeter(), where its concrete subclasses must provide its implementation.
        //All instance variables shall have protected access, i.e., accessible by its subclasses and classes in the same package.
        //Mark all the overridden methods with annotation @Override.
        //In this exercise, Shape shall be defined as an abstract class, which contains:
        //
        //Two protected instance variables color (String) and filled (boolean). The protected variables can be accessed by its subclasses and classes in the same package.
        //Getter and setter for all the instance variables, and toString().
        //Two abstract methods getArea() and getPerimeter() (shown in italics in the class diagram).
        //The subclasses Circle and Rectangle shall override the abstract methods getArea() and getPerimeter() and provide the proper implementation. They also override the toString().

        Circle circle = new Circle();

        circle.setR(4.0);
        circle.getArea();
        circle.getPerimeter();

        Rectangle rectangle = new Rectangle();

        rectangle.setLength(7);
        rectangle.setWidth(3);
        rectangle.getArea();
        rectangle.getPerimeter();
    }
}

