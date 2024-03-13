import java.util.Scanner;

public class counting 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int passedCount = 0;
        int mark = 0;

        while (mark != -123) 
        {
            System.out.print("Enter student mark (-123 to stop):  ");
            mark = scanner.nextInt();

                if (mark >= 0 && mark <= 100) 
                {
                    if (mark >= 50) 
                    {
                        passedCount++;
                    }
                } 
                else 
                {
                    System.out.println("Invalid mark. Please enter a mark between 0 and 100.");
                }
            
        }

        System.out.println("Count of passed students: " + passedCount);

        scanner.close();
    }
}
