package loops;

/**
 * Java Program of a DoWhile Loop demonstration
 * the syntax
 * and how to use a DoWhile Loop
 *
 * @author Kgotso Matjato
 */
public class DoWhileLoop {

    public static void main(String[] args)
    {
        /*
        Syntax:
        declare/initialization;
        do
        {
            code...
            increment or decrement
        }while ();
        */

        int i = 1;
        do
        {
            System.out.println("the do while loop is running");
            i++;
        }while (i <= 2);

        System.out.println("the do while loop ended");
    }
}
