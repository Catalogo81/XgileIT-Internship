package Java_Basics;

public class Doubles
{
    public static void main(String[] args) {

        double num1 = 5.5;
        System.out.println("num: " + num1);

        //adding an int variable with a double variable to a double variable
        int num2 = 5;
        double double_answer = num1 + num2;
        System.out.println("double answer: " + double_answer);

        //adding an int variable with a double variable to an int variable
        int int_answer = (int) (num1 + num2); // 5.5 +
        System.out.println("int answer: " + int_answer);
    }
}
