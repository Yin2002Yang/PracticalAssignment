class ExtendThread extends Thread
{
    public void run()
    {
        System.out.println("Creating a thread extending the thread class.");
    }
}

public class ExtendThreadTestDrive
{
    public static void main(String[] args)
    {
        ExtendThread thread = new ExtendThread();
        thread.start();
        try
        {
            thread.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Successfully closed thread " + thread.getName() + ". With priority " + thread.getPriority());
    }
}
