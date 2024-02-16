package Examples;

import java.util.Random;
public class Random1 
{
    public static void main(String[] args) 
    {
        Random r = new Random();
        int x = r.nextInt(); // Random Number
        System.out.println(x);
        int die = r.nextInt(6)+1; // Random with range 
        System.out.println(die);
        
    }
    
}
