import java.util.Scanner;

public class StudentAverage 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int totalMarks = 0;
        int numberOfStudents = 0;
        int mark=0;
        while (mark!=-1) 
        {
            System.out.print("Enter student mark (enter -1 to calculate average): ");
            mark = scanner.nextInt();

                if (mark != -1) 
                {
                    
                    if (mark >= 0 && mark <= 100) 
                    {
                        totalMarks += mark;
                        numberOfStudents++;
                    } 
                    else 
                    {
                        System.out.println("Invalid mark. Please enter a mark between 0 and 100.");
                    }
                }  
            }
        double average = (numberOfStudents > 0) ? (double) totalMarks / numberOfStudents : 0;
        System.out.println("Average student mark: " + average);
        scanner.close();
    }
}
