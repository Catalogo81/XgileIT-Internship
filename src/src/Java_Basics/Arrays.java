package Java_Basics;

public class Arrays
{
    public static void main(String[] args)
    {
//Write a Java Program to find the second-highest number in an array.
        int[] numbers = {3, 5, 60, 44, 31, 7, 9, 61};

        int lowest = 0;
        int highest = 0;

        // for(int i = 0; i < numbers.length; i++)
        // {
        // if(numbers[0] > numbers[i])
        // {
        // highest = numbers[0];
        // System.out.println( highest + " number at position 1 is highest");
        // }
        // else if(numbers[1] > numbers[i])
        // {
        // highest = numbers[1];
        // System.out.println( highest + " number at position 2 is highest");
        // }
        // else if(numbers[2] > numbers[i])
        // {
        // highest = numbers[2];
        // System.out.println( highest + " number at position 3 is highest");
        // }
        //}

        java.util.Arrays.sort(numbers);//built in method for sorting arrays

        System.out.println(java.util.Arrays.toString(numbers));//converts the array to string and displays the array

        int i = numbers.length; //gets the size of the array
        int secondLargest = numbers[i-2]; //gets the second last item in the array

        //just to be sure i will check if the last number is not equal to the second last number
        //there is probably a way to check for duplicate numbers and then check if those duplicates
        //are not one of the highest numbers then only be able to check where the second highest number is at
        if(secondLargest == numbers[i-1])
        {
            secondLargest = numbers[i-3];
            System.out.println("The second largest is: " + secondLargest); //displays the result
        }
        else
        {
            System.out.println("The second largest is: " + secondLargest); //displays the result
        }
    }
}
