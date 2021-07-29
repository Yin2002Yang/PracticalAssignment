public class MultipleExp
{
    public static void main(String[] args)
    {
        boolean iLikeFunCode = true;
        try
        {
            if (iLikeFunCode)   throw new ArrayIndexOutOfBoundsException("Nothing nothing");
            if (iLikeFunCode)   throw new ArithmeticException("Really nothing");
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException ex)
        {
            System.out.println(ex);
        }
    }
}
