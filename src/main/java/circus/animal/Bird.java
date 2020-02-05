package circus.animal;

public abstract class Bird extends Animal {
    public void fly() {
        System.out.println("Whee ...");
    }

    //Bird extends Animal which is an abstract class and imposes speak method (returns error)
    //therefore we make Bird an abstract class as well
    //abstract classes do not have to implement methods specified by parent class, leaves it to child classes
}
