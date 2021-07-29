public class HandlingArrayIndexOutOfBoundsException
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        int num = 4;
        int index = -1;
        try
        {
            arr[index] = num;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Illegal location of array has been tried to access.");
            System.out.println("Please have the value of index between 0 and 5.");
            System.out.println("Current value of index: " + index);
            System.out.println(e);
        }
    }
}
