package Examples;

public class Strings2
{
    public static void main(String[] args) 
    {
        String s1 = new String( "Hello " );
        int Len = s1.length();
        System.out.println(Len);
        String s2 = s1.toUpperCase();
        String s3 = s1.toLowerCase();
        System.out.println("Upper: "+s2);
        System.out.println("Lower: "+ s3);
        
    }
    
}
