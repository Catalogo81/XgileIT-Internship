package oops;

//Inheriting properties and behaviours from parent
public class Inheritance
{
    public static void main(String[] args) //has-a
    {
        CalcVeryAdv c1 = new CalcVeryAdv(); //creating a calculator object
        int sumResult = c1.add(4, 5);
        int minusResult = c1.minus(4, 5);
        int multiResult = c1.multi(4, 5);

        System.out.println("Answer: " + sumResult);
        System.out.println("Answer: " + minusResult);
        System.out.println("Answer: " + multiResult);

    }
}

class Calculator //parent, super class
{
    public int add(int i, int j)
    {
        return i + j;
    }
}

class CalcAdv extends Calculator //child class, is-a
{
    public int minus(int i, int j)
    {
        return i - j;
    }
}
class CalcVeryAdv extends CalcAdv //child class, is-a
{
    public int multi(int i, int j)
    {
        return i * j;
    }
}


