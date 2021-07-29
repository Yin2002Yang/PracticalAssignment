public class RunTimeExp
{
    public static void main(String[] args)
    {
        int a = 6, b = 0;
        try
        {
            int c = a / b;
            System.out.println("Value of c is " + c);
        }
        catch(ArithmeticException e)
        {
            if (b == 0)
            {
                System.out.println("If you try to divide a number by zero your math teacher will be upset.");
            }
        }
    }
}
