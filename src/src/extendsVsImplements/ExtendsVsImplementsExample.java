package extendsVsImplements;

/**
 * Java Program to demonstrate what is the differences are between
 * abstract class and Interface
 * By using an Animal super class example
 *
 * @author Kgotso Matjato
 */
public class ExtendsVsImplementsExample {

    public static void main(String[] args) {

        Horse horse = new Horse();

        horse.setName("Clover");
        horse.setWeight(150.5);
        horse.setAge(15);

        System.out.println(horse.name);
        System.out.println(horse.weight);
        System.out.println(horse.age);

        Lion lion = new Lion();

        lion.setName("Simba");
        lion.setWeight(114.5);
        lion.setAge(11);

        System.out.println(lion.name);
        System.out.println(lion.weight);
        System.out.println(lion.age);
    }
}
