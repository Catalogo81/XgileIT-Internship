package oops;

/*ability for an object to take in different forms
when a class has the ability to provide different implementations of a method, depending on the type of object passed
to method */
public class Polymorphism
{
    public static void main(String[] args) {
        Shapes myShape = new Shapes(); //ordinary shape object
        Shapes myTriangle = new Triangle(); //triangle shape object
        Shapes myCircle = new Circle(); //circle shape object

        /* call the objects and its methods */
        myShape.area();
        myTriangle.area();
        myCircle.area();
    }
}

class Shapes
{
    public void area()
    {
        System.out.println("Formula for area of a shape is...");
    }
}

class Triangle extends Shapes
{
    public void area()
    {
        System.out.println("Formula for area of a Triangle is half base times height");
    }
}

class Circle extends Shapes
{
    public void area()
    {
        System.out.println("Formula for area of a Circle is 3.14 times radius squared");
    }
}
