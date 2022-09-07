package extendsVsImplements;

/*
 * A concrete class to implement Animal, since a Lion IS-A Animal
 * implementing Animal is justified. it got all properties of
 * animal.
 */
public class Lion implements IAnimal{

    public String name;
    public double weight;
    public int age;

    //Getters
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public int getAge() {
        return age;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
