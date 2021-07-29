class uselessThread implements Runnable
{
    public void run()
    {
        System.out.println("A Thread is running!");
    }
}

public class MultiThreadImplement
{
    public static void main(String[] args)
    {
        final int MAX = 10;
        for (int i = 0; i < MAX; i++)
        {
            Runnable reference = new uselessThread();
            Thread thread = new Thread(reference);
            thread.start();
            System.out.println("Thread name is " + thread.getName());
        }
    }
} 
