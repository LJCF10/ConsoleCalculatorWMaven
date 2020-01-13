package ch.bbw._ConsoleCalculatorWMaven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Calculator calc = new Calculator();
        
        System.out.println(calc.addition(3,5));
        
        System.out.println(calc.division(6,0));
    }
}
