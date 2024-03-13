import java.util.Scanner;;
public class While3 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double  n1, n2, r=0;
        int choice = 0;
        while (choice != 5)
        {

        System.out.println("Select the operation:\n 1: +\n 2:-\n 3:*\n 4:/ \n 5:Exit");
        choice = input.nextInt();
        System.out.println("Enter first number: ");
        n1 = input.nextDouble();
        System.out.println("Enter Second number: ");
        n2 = input.nextDouble();
        
        if (choice == 1)
        {
            r = n1+n2;
        }
        else if (choice ==2)
        {
            r = n1-n2;
        }
        else if (choice == 3)
        {
            r = n1*n2;
        }

        else if (choice == 4)
        {
            r = n1/n2;
        }

        else 
        {
            System.out.println("Invalid choice ");
        }

        System.out.println("The result is: "+r);
    }
}
    
}
