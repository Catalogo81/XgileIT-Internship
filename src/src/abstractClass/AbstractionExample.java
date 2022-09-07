package abstractClass;

/**
 * Java Program to demonstrate what is abstract class and
 * abstract method in Java, how to use
 * them, and when to use them.
 *
 * @author Kgotso Matjato
 */
public class AbstractionExample {

    public static void main(String[] args) {

        //creating a tree house
        TreeHouse myTreeHouse = new TreeHouse();

        myTreeHouse.makeDoor();
        myTreeHouse.applyRoofing();
        myTreeHouse.makeWindows();

        //creating a dog house
        DogHouse myDogHouse = new DogHouse();

        myDogHouse.applyRoofing();
    }
}
