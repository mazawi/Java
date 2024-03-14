import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0; 
        while (userInput != -1) {
            System.out.print("Enter integers (enter -1 to stop): ");
            userInput = scanner.nextInt();
            if (userInput != -1) {
                System.out.println("You entered: " + userInput);
            }
        }
        System.out.println("Program terminated. Goodbye!");
        scanner.close();
    }
}
