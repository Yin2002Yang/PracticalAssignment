import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;

public class CompileTimeExp
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("A_file_that_doesnt_exist");
            FileInputStream stream = new FileInputStream(file);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("As long as the file doesn't exist compiler is going to be upset.");
        }
    }
}
