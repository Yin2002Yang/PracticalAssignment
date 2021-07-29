class myThread extends Thread
{
    public void run()
    {
        System.out.println("Running a thread named " + this.getName());
    }
}

public class GetSetName
{
    public static void main(String[] args)
    {
        final int max = 5;
        for (int i = 0; i < max; i++)
        {
            myThread newThread = new myThread();
            newThread.setName("Thread#" + i);
            newThread.start();
        }
    }
}
