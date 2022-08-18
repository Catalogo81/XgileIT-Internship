package Java_Basics;

import java.util.Scanner;

public class Operators_With_Conditions
{
    public static void main(String[] args) {

        //This is a program checks for an operant a user passes and make a calculation
        //Using simple if-statements

        char operant;
        int number1, number2, result = 0;

        Scanner scn = new Scanner(System.in);

        System.out.print("Please enter your first number, then press Enter: ");
        number1 = scn.nextInt();

        System.out.print("Please enter your operant between(+, -, /, *, %), then press Enter: ");
        operant = scn.next().charAt(0);

        System.out.print("Please enter your second number, then press Enter: ");
        number2 = scn.nextInt();

        if(operant == '+')
        {
            result = number1 + number2;
            System.out.print(number1 + " " + operant + " " + number2 + " = " + result);
        }
        else  if(operant == '-')
        {
            result = number1 - number2;
            System.out.print(number1 + " " + operant + " " + number2 + " = " + result);
        }
        else  if(operant == '*')
        {
            result = number1 * number2;
            System.out.print(number1 + " " + operant + " " + number2 + " = " + result);
        }
        else  if(operant == '/')
        {
            result = number1 / number2;
            System.out.print(number1 + " " + operant + " " + number2 + " = " + result);
        }
        else  if(operant == '%')
        {
            result = number1 % number2;
            System.out.print(number1 + " " + operant + " " + number2 + " = " + result);
        }
        else
        {
            System.out.print("Sorry, Invalid operant entered");
        }

    }
}
