class uselessThread extends Thread
{
    public void run()
    {
        System.out.println(this.getName() + " is running!");
    }
}

public class MultiThreadExtend
{
    public static void main(String[] args)
    {
        final int MAX = 10;
        for (int i = 0; i < MAX; i++)
        {
           uselessThread thread = new uselessThread();
          thread.start();
        }
    }
} 
