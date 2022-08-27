package javaBasics;

public class StringManupilation
{
    public static void main(String[] args)
    {
        String str = "The rains have started here s";
        String str1 = "The rains have started here s";
        String str2 = "The rains Have started here s";

        //length of string
        System.out.println(str.length());

        //get the character of 5 position
        System.out.println(str.charAt(5));

        //gets the position of character 's' (1st occurrence)
        System.out.println(str.indexOf('s'));

        //gets the index of the next s in the string (2nd occurrence)
        System.out.println(str.indexOf('s', 9)); //hard coding it
        System.out.println(str.indexOf('s', str.indexOf('s') + 1));

        //gets the index of the next s in the string (3rd occurrence)
        System.out.println(str.indexOf('s', (str.indexOf('s') + 1) + 1));

        //getting the index of a string
        System.out.println(str.indexOf("have"));

        //if you search for a string that's not in the String you will get -1
        System.out.println(str.indexOf("hello")); //-1

        //check if strings are equal (string comparison)
        System.out.println(str.equals(str1));

        //check if strings are equal with a capital letter(string comparison)
        System.out.println(str.equals(str2));

        //ignoring the casing
        System.out.println(str.equalsIgnoreCase(str2));

        //getting a sub string e.d: The rains
        System.out.println(str.substring(0, 8+1));

        //trim (trims before and after spaces only):
        String s = "   Hello World   ";
        System.out.println(s.trim());

        //removes the remaining space from: Hello World
        System.out.println(s.replace(" ", ""));

        String date = "12-02-2022";

        //replaces the dash to forward slash: 12/02/2022
        System.out.println(date.replace("-", "/"));



        //add another character to a string
        System.out.println(str1.concat(" Kgotso"));

        //concatenating string with int
        int a = 100, b = 200;
        String number = "Hundred";
        System.out.println(a + b); //answer = 300
        System.out.println(a + number + b); //answer = 100Hundred200
        System.out.println(number + a + b); //Hundred100200
    }
}
