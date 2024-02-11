import java.util.Scanner;

public class Ex03 
{

    public static int readInteger() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        return number;
    }

    public static void main(String[] args) 
    {
        int userInput = readInteger();
        System.out.println("The entered integer is: " + userInput);
    }
}
