package extendsVsImplements;

/*
 * An Animal super class
 * This class can be extended or an interface of it can be created
 */
public class Animal {

    public String name;
    public double weight;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
