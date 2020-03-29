import java.io.*;

class copy_contents
{
    public static void main(String []args)
    {
        try
        {
            FileReader fr= new FileReader("data1.txt");
            FileWriter fw= new FileWriter("data2.txt");
            int character;
            while((character=fr.read())!=-1)
                fw.write(character);
            fr.close();
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
