class Thread_A extends Thread
{
    public void run()
    {
        for(int i=1; i<21; i++)
            if(i%2==0)
                System.out.println(i);
    }
}
class Thread_B extends Thread
{
    public void run()
    {
        for(int i=1; i<21; i++)
            if(i%2==1)
                System.out.println(i);
    }
}

class ThreadTest
{
    public static void main(String[] args) {
        new Thread_A().start();
        new Thread_B().start();
    }
}
