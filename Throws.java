public class Throws
{
    public static void main(String[] args) throws ArithmeticException
    {
        int a = 0, b = 2;
        int c = 0;
        try
        {
            c = b / a;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("C: " + c);
    }
}
