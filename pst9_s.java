import java.net.*;
import java.io.*;

public class pst9_s
{
    public static void main(String[] args){
        try{
            ServerSocket ss= new ServerSocket(8080);
            Socket s= ss.accept();
            DataOutputStream dos= new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            while(true){
                System.out.println(dis.readUTF());
                dos.writeUTF(br.readLine());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
