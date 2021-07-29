class Super
{
    public void uselessMessage()
    {
        System.out.println("A useless message has been printed on screen.");
    }
}

class Base extends Super implements Runnable
{
    public void moreuselessMessage()
    {
        System.out.println("This is yet another useless message!");
    }
    public void run()
    {
        uselessMessage();
        moreuselessMessage();
    }
}

public class ImplementThreadTestDrive
{
    public static void main(String[] args)
    {
        Runnable test = new Base();
        Thread newThread = new Thread(test);
        newThread.start();
    }
}
