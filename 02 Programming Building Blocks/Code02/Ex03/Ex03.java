import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        
        int a,b,c,d,e,sum,avg;
        
        System.out.println("Please enter five tests score: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        
        sum=a+b+c+d+e;
        avg=(sum/5);
        
        System.out.println("Sum = "+ (double)sum);
        System.out.println("Average = "+ (double)avg);
        
        
    }
    
}
