package javaBasics;

public class Booleans
{
    public static void main(String[] args) {

        // initialized 'a' and 'b'
        int a = 40;
        int b = 60;

        // initialized boolean variables 'a1' and 'b1'
        boolean a1 = true;
        boolean b1 = false;

        /*
         *  if condition starts here. If this condition matches
         *  then 'a1' will be printed.
         */

        if (a > b){
            System.out.println(a1);
        }
        else {
            System.out.println(b1);
        }

        boolean b3 = (b1==a1);
        boolean b4 = (b1!=a1);

        // b1 is false
        System.out.println(b1);

        // a1 is true
        System.out.println(a1);

        // b3 is false
        System.out.println(b3);

        // b4 is true
        System.out.println(b4);
    }
}
