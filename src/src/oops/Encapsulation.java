package oops;

//binding data with methods
public class Encapsulation
{
    public static void main(String[] args) {

        //create a student
        Student s1 = new Student();
        s1.setName("Kgotso");
        s1.setRollNum(6);

        //display
        System.out.println("Name: " + s1.getName());
        System.out.println("RollNum: " + s1.getRollNum());
    }

}

class Student {

    //variables
    private int rollNum;
    private String name;

    //Getters and Setters

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

