package loops;

/**
 * Java Program of a While Loop demonstration
 * the syntax
 * and how to use a While Loop
 *
 * @author Kgotso Matjato
 */
public class WhileLoop {

    public static void main(String[] args)
    {
        /*
        Syntax:
        declare/initialization;
        while(condition)
        {
            code...
            increment or decrement
        }
        */

        int i = 1;
        while(i <= 4)
        {
            System.out.println("the while loop is running");
            i++;
        }

        System.out.println("the while loop ended");
    }
}
