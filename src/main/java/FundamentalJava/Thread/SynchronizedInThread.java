package FundamentalJava.Thread;

public class SynchronizedInThread
{
    public static void main(String[] args)
    {
        commonsynch synch=new commonsynch();
        Thread th1=new Thread()
        {
            public void run()
            {
                synch.printableAnTablePerformance(5);
            }
        };
        Thread th2=new Thread()
        {
            public void run()
            {
                synch.printableAnTablePerformance(7);
            }
        };
        th1.start();
        th2.start();
    }
}

class commonsynch
{
   synchronized public void printableAnTablePerformance(int add)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i+"X"+ add +" = " +add*i);//1 X 5 = 5
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}