import java.net.*;

class pst6
{
    public static void main(String[] args) throws MalformedURLException
    {
        URL url= new URL("https://stackoverflow.com");
        System.out.println("Protocol: "+ url.getProtocol());
        System.out.println("Host Name: "+ url.getHost());
        System.out.println("Port Number: "+ url.getPort());
        System.out.println("File Name: "+ url.getFile());
    }
}
