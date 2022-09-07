package abstractClass;

/*
 * A concrete class to extend House, since DogHouse IS-A House
 * extending House is justified. it got some properties of
 * house, and it defines how to make a dog house.
 */
public class DogHouse extends House{
    @Override
    void applyRoofing() {
        super.applyRoofing();
    }

    //one can customize the dog house as they please
}
