
package Code02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("Enter lenght and width: ");
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int w=sc.nextInt();
        
        int area=l*w;
        int per= 2 * (l + w);
        
        System.out.println("Area = "+ area);
        System.out.println("Perimeter = "+ per);
        
    }
    
}