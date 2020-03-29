import java.io.*;
class MyException extends Exception
{
    MyException(String msg)
    {
        super(msg);
    }
}

class Excp
{
    public static void main(String[] args) {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        try
        {
        System.out.print("Enter a number: ");
        int num= Integer.parseInt(br.readLine());
            if(num%2==1)   // if(num%2==0)
                throw new MyException("Number is not even");  // even -> odd
            else
                System.out.println("Number is even"); // even -> odd
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {}
    }
}
