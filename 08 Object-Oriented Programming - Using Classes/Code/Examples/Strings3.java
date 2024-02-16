package Examples;

public class Strings3
{
    public static void main(String[] args) 
    {
        String s1 = new String( "Welcome to Java " );
        int ind1 =s1.indexOf('J');
        System.out.println("The index of (J) is: "+ ind1);
        int ind2 = s1.indexOf("to");
        System.out.println("The index of (to) is: " + ind2);
        String s2 = s1.substring(2, 5);
        System.out.println("The substring between 2 and 5 is: "+s2);


        
    }
    
}