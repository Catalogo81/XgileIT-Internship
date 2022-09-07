package extendsVsImplements;

import java.util.Scanner;

import static extendsVsImplements.IAnimal.tooOld;

/**
 * Java Program to demonstrate what is the differences are between
 * abstract class and Interface
 * By using an Animal super class example
 *
 * @author Kgotso Matjato
 */
public class ExtendsVsImplementsExample {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
        //lion.setAge(10);

        System.out.print("Please enter animal age to check if it is old or not: ");
        int lionAge = sc.nextInt();

        System.out.println(lion.name);
        System.out.println(lion.weight);

        //System.out.println(lion.age);

        //still not sure about this implementation
        if(lionAge > tooOld)
        {
            for(int i = 0; i >= tooOld; i++)
            {
                System.out.println("Animal is too old, enter new age: ");
            }
        }
        else
        {
            System.out.println("Lion is " + lionAge + " and still young");
        }

    }
}
