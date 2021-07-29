import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;

public class tryCF
{
    public static void main(String[] args)
    {
        boolean iAmStupid = true;
        try
        {
            if(iAmStupid) throw new ArithmeticException("Useless Exception 1");
            if(iAmStupid) throw new ArrayIndexOutOfBoundsException("Useless Exception 2");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Whatever you do this will always get's to show off.");
        }
    }
}
