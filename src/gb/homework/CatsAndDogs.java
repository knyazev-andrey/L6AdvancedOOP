package gb.homework;
/**
 * @author Andrey Knyazev
 * @version dated by 08.06.2018
 */

public class CatsAndDogs {

    public static void main(String[] args) {
        Animal[] animals = {new Cat("Musya", "grey", 3), new Dog("Valter", "brown", 4), new Dog("Boris", "black", 7)};
        for (Animal animal : animals) {
            System.out.println(animal.run(300));
            System.out.println(animal.swim(8));
            System.out.println(animal.jump(2));
        }
    }
}

class Cat extends Animal {

    Cat(String name, String color, int age) {
        super(name, color, age);
        setRunConstraint((int) (Math.random() * 200));
        setSwimConstraint(0);
        setJumpConstraint((int) (Math.random() * 2));
    }

    @Override
    public boolean run(int distance) {
        return distance <= getRunConstraint();
    }

    @Override
    public boolean swim(int distance) {
        return distance <= getSwimConstraint();
    }

    @Override
    public boolean jump(int height) {
        return height <= getJumpConstraint();
    }
}

class Dog extends Animal {

    Dog(String name, String color, int age) {
        super(name, color, age);
        setRunConstraint((int) (Math.random() * 600));
        setSwimConstraint((int) (Math.random() * 10));
        setJumpConstraint((int) (Math.random()));
    }

    @Override
    public boolean run(int distance) {
        return distance <= getRunConstraint();
    }

    @Override
    public boolean swim(int distance) {
        return distance <= getSwimConstraint();
    }

    @Override
    public boolean jump(int height) {
        return height <= getJumpConstraint();
    }

}

interface IActionable {
    boolean run(int distance);
    boolean swim(int distance);
    boolean jump(int height);
}


abstract class Animal implements IActionable {

    private String name;
    private String color;
    private int runConstraint;
    private int swimConstraint;
    private int jumpConstraint;
    private int age;

    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    int getRunConstraint() {
        return runConstraint;
    }

    void setRunConstraint(int runConstraint) {
        this.runConstraint = runConstraint;
    }

    int getSwimConstraint() {
        return swimConstraint;
    }

    void setSwimConstraint(int swimConstraint) {
        this.swimConstraint = swimConstraint;
    }

    int getJumpConstraint() {
        return jumpConstraint;
    }

    void setJumpConstraint(int jumpConstraint) {
        this.jumpConstraint = jumpConstraint;
    }
}


