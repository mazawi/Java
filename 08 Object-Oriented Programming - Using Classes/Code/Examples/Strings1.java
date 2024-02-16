package Examples;

public class Strings1 
{
    public static void main(String[] args) 
    {
        String s1 = new String( "Hello " );
        String s2 = "there. ";
        String s3 = s1 + s2; // s3 is:  Hello there
        s3 += "!";  // s3 is now:  Hello there!
        System.out.println(s3);
        
    }
    
}
