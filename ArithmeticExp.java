import java.math.BigDecimal;

public class ArithmeticExp
{
    public static void main(String[] args)
    {
        BigDecimal num1 = new BigDecimal(1);
        BigDecimal num2 = new BigDecimal(3);
        try
        {
            num1 = num1.divide(num2);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
