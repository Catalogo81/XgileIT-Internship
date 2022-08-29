package oops;

public class Abstraction
{
    /* Hiding all the implementation details and showing the functionality */

    /* Syntax:
        Abstract Class
        abstract class classname{
        -------
        -----
        }

        Abstract Method
        abstract void display();
     */
    public static void main(String[] args) {

        Honda h1 = new Honda();
        h1.run();
    }
}

//Abstract class
abstract class Bike{
    abstract void run();
}

class Honda extends Bike{
    public void run()
    {
        System.out.println("Honda bike is running");
    }

}
