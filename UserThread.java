class MyThread implements Runnable
{
    public void run()
    {
        System.out.println("Running an user defined thread.");
    }
}

public class UserThread
{
    public static void main(String[] args)
    {
        Runnable aThread = new MyThread();
        Thread newThread = new Thread(aThread);
        newThread.start();
    }
}
