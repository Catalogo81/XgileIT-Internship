package abstractClass;

/*
 * Another concrete class to extend House.
 */
public class TreeHouse extends House{

    /*
     * Methods that one choose to use while creating a Tree House.
     */
    @Override
    void applyRoofing() {
        super.applyRoofing();
    }

    @Override
    void makeWindows() {
        super.makeWindows();
    }

    @Override
    void makeDoor() {
        super.makeDoor();
    }

    //bathroom is not needed in the tree house
}
