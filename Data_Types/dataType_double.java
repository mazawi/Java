package Data_Types;

public class dataType_double {
    public static void main(String[] args) {
        double a = 1.5;
        double b = 2.4 ;
        double sum  = a + b;
        double mul = a * b;
        double div = a / b;
        double rem  = a % b;
        double sub = a-b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " * " + b + " = " + mul);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " % " + b + " = " + rem);

        System.out.println();
        System.out.println("sin(pi/2) = " + Math.sin(Math.PI/4));
        System.out.println("log(e)    = " + Math.log(123));
    }  
}
