package interfaceClass;

import java.util.Objects;

/**
 * Java Program to demonstrate what is an interface
 * in Java, how to use it
 * and when to use it.
 *
 * @author Kgotso Matjato
 */
public class InterfaceExample implements IDoor{

    public static void main(String[] args) {

        System.out.println(doorType);

        InterfaceExample interfaceExample = new InterfaceExample();
        interfaceExample.openOrCloseDoor("Open");
    }


    @Override
    public void openOrCloseDoor(String openCommand) {

        if(Objects.equals(openCommand, "Open"))
            System.out.println("Door is opening");
        else if (Objects.equals(openCommand, "Close"))
            System.out.println("Door is closing");
        else
            System.out.println("Command not recognized, please use alternative entrance");
    }
}

/*
 * Door Interface, defined only essential
 * properties of a Door and the main actions one can make at
 * a door
 */
interface IDoor {

    String doorType = "Automatic Door";

    void openOrCloseDoor(String command);
}
