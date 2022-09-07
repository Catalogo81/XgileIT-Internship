package abstractClass;

/*
 * Abstract class to represent a House, defined only essential
 * properties and methods found in a House.
 *
 * @author Kgotso Matjato
 */
public abstract class House {

    String roof;
    String windows;
    String doors;

    /*
     * These are my methods, that depict the actions for building structures
     * in any type of house
     */
    void applyRoofing() {
        System.out.println("Roofing is being applied");
    }

    void makeWindows() {
        System.out.println("Windows are being applied");
    }

    void makeDoor() {
        System.out.println("A door is applied");
    }

    void makeBathroom() {
        System.out.println("A bathroom is created");
    }
}
