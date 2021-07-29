public class HandlingArithmeticException
{
    public static void main(String[] args)
    {
        int a = 0, b = 2;
        int c = 0;
        try
        {
            c = b / a;
        }
        catch(ArithmeticException e)
        {
            System.out.println("An exception is occured but handled.");
            System.out.println("Please take care of the value of variable c.");
            System.out.println("Value of c: " + c);
            System.out.println(e);
        }
    }
}
