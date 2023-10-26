package CH_06_INPYT;
import java.util.Scanner;

public class Ex1 
{
    public static void main(String[] args) 
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter N1: ");
            int n1 = input.nextInt();
            System.out.println("Enter N2: ");
            int n2 = input.nextInt();
            int r = n1+n2;

            System.out.println("the sum is: "+ r);

        }
}