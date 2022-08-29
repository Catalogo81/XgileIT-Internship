package oops;

//process of creating multiple methods if the same name in the same class, and all methods work in different ways
public class MethodOverloading
{
    public static void main(String[] args) {
        MyShapes myShapes = new MyShapes();

        myShapes.area(); //any area
        myShapes.area(5); //circle area
        myShapes.area(6.4, 1.45); //triangle area
    }
}

class MyShapes
{
    public void area()
    {
        System.out.println("Formula for area of a shape is...");
    }

    public void area(int r) // radius
    {
        //area = 3.14 * r * r
        System.out.println("Formula for area of a Circle is 3.14 times radius squared");
    }

    public void area(double b, double h) //breath, height
    {
        //area = 0.5 * b * h
        System.out.println("Formula for area of a Triangle is half base times height");
    }
}
