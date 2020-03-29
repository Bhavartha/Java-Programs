import java.util.Scanner;

class Cipher
{
    static void Ceaser(String ip,int key, Boolean decrypt)
    {
        String op ="";
        if (decrypt)
            key = -key;
        for(char c: ip.toCharArray())
            op+= (char) ((int) c + key);
        System.out.println(op);
    }
    static void Ceaser(String ip,int key)
    {
        Cipher.Ceaser(ip,key,false);
    }

    static void RailFence(String ip, int key)
    {
        // int index= ip.length()%key==0? ip.length()/key: ip.length()/key+1;
        int index=key;
        String op[] = new String[index];
        java.util.Arrays.fill(op,"");
        for(int i=0; i<ip.length(); i++)
        {
            op[i%index] += ip.charAt(i);
        }
        for(String o:op)
            System.out.print(o);
        System.out.println();
    }

    public static void main(String[] args)
    {
        // Scanner s = new Scanner(System.in);


        Cipher.Ceaser("hello",5);
        Cipher.Ceaser("mjqqt",5,true);
        Cipher.RailFence("Bhavartha",4);
    }
}
