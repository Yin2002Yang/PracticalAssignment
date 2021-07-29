class Age
{
    private int age;
    public void setAge(int num) throws InvalidAgeException
    {
        if (num < 18) throw new InvalidAgeException("Not yet, Your time has not come yet!");
        else if (num < 0) throw new InvalidAgeException("You gotta be joking right? Your age is negetive?");
        num = age;
    }
    
    public int getAge()
    {
        return age;
    }
}

class InvalidAgeException extends Exception
{
    InvalidAgeException(String s)
    {
        super(s);
    }
}

public class AgeTestDrive
{
    public static void main(String[] args)
    {
        Age age = new Age();
        try
        {
            age.setAge(5);
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e);
        }
    }
}
