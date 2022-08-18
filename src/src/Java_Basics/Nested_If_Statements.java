package Java_Basics;

import java.util.Scanner;

public class Nested_If_Statements
{
    public static void main(String[] args)
    {
        //This program checks 3 numbers for the largest between them
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;//variables

        //read numbers from user
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        num3 = scanner.nextInt();

        //checks number 1 is bigger than 2 and or 3
        if(num1 > num2)
        {
            if(num1 > num3)
            {
                System.out.print(num1 + " is the largest");
            }
            else
            {
                System.out.print(num3 + " is the largest");
            }
        }
        //checks number 2 is bigger than 1 and or 3
        else if(num2 > num3)
        {
            System.out.print(num2 + " is largest");
        }
        else //checks number 3 is bigger than 2 and or 1
        {
            System.out.print(num3 + " is the largest");
        }
    }
}
