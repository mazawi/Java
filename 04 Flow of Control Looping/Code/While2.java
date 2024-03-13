import java.util.Scanner;;
public class While2
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
        System.out.println("Your choice is : "+choice);
        
        }
        
    }
    
}
