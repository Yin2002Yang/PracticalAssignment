class myThread extends Thread
{
    public boolean valid;
    public void run() {System.out.println(this.getName() + " is running.");} 
}

public class GetSetPriority
{
    public static void main(String[] args)
    {
        final int max = 5;
        final int maxPriority = 10;
        myThread[] threads = new myThread[max];
        for (int i = 0; i < max; i++)
        {
            int rand = (int) (Math.random() * maxPriority) + 1;
            threads[i] = new myThread();
            threads[i].setPriority(rand);
            threads[i].valid = true;
        }

        for (int i = 0; i < max; i++)
        {
            System.out.println(threads[i].getName() + " has a priority of " + threads[i].getPriority());
            threads[i].start();
        }
    }
}
