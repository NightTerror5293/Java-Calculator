import java.util.Scanner;
class Calculator
{
    public static void main(String args[])
    {
        char operator;
        System.out.println("Welcome to Calculator!");
        System.out.println("1. Enter + to add two Numbers");
        System.out.println("2 Enter - to subtract two Numbers");
        System.out.println("3. Enter * to multiply two Numbers");
        System.out.println("4. Enter / to divide two Numbers");

        Scanner scanner = new Scanner(System.in);

        Calculator c = new Calculator();

        while(true)
        {
            System.out.println("\nEnter your operator");
                operator = scanner.next() .charAt(0);

                if(operator == 'E')
                {
                    System.out.println("Thank you for using calculator!");
                    break;
                }
                if(operator == '+')
                {
                    c.addition();
                }
                else if(operator == '-')
                {
                    c.subtraction();
                }
                else if (operator == '*')
                {
                    c.multiplication();
                }
                else if (operator == '/')
                {
                    c.division();
                }


                else
                {
                    System.out.println("you entered incorrect operator");
                }
        }
    }
    public void addition()
    {
        double num1=0, num2=0;
        double result=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        num2 = scanner.nextInt();
        result = num1+num2;
        System.out.println("Result of addition is: " +result); 
    }
    public void subtraction()
    {
        double num1=0,  num2=0;
        double result=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        num2 = scanner.nextInt();
        result = num1-num2;
        System.out.println("Reslut of subtraction is: " +result);
    }
    public void multiplication()
    {
        double num1=0, num2=0;
        double result = 0;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter first number");
        num1 = scanner.nextInt();
        System.out.println("Enter second number");
        num2 = scanner.nextInt();
        result = num1 * num2;
        System.out.println("Result of multiplication is:" +result);
    }
    public void division()
    {
        double num1=0, num2=0;
        double result= 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        num2 = scanner.nextInt(); 
        try
        {
            result = num1/num2;
            System.out.println("Result of division is :" +result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception is " +e);
                System.out.println("Zero is an invalid denominator. Please try again.");
        }
    }
}