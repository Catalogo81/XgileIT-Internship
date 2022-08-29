package oops;

//The process when a child class has the same method declared in the parent class
public class MethodOverriding
{
    public static void main(String[] args)
    {
        Car car = new Car(); //car2 object created

        car.run(); //calling from the child class
    }
}

class Vehicle //parent
{
    void run()
    {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle//child
{
    void run()
    {
        System.out.println("car is running safely");
    }
}
