import java.net.*;
import java.io.*;

public class pst9_c
{
    public static void main(String[] args) {
        try{
            Socket cs= new Socket("localhost",8080);
            DataInputStream dis = new DataInputStream(cs.getInputStream());
            DataOutputStream dos= new DataOutputStream(cs.getOutputStream());
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            while(true){
                dos.writeUTF(br.readLine());
                System.out.println(dis.readUTF());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
