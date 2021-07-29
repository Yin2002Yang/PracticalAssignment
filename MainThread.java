public class MainThread extends Thread
{
    public static void main(String[] args)
    {
        Thread t = new Thread();
        t = Thread.currentThread();
        System.out.println("Current Thread: " + t.getName());
        System.out.println("The " + t.getName() + " thread has a priority of value " + t.getPriority());
    }
}
