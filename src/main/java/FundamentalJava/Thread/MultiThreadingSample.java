package FundamentalJava.Thread;

public class MultiThreadingSample
{
    public static void main(String[] args) throws InterruptedException  //Main-Thread...
    {
        Book book=new Book(); //Thread name is book
        Note note=new Note();
        Thread th=new Thread(note);
        book.start(); //
//      book.Sample();
        th.start();
        th.join();
        book.join();
        System.out.println("Thank you All");  //main Thread
    }
}
class Book extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread is start");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Note implements Runnable
{
    public void run()
    {
        for(int pos=1;pos<=5;pos++)
        {
            System.out.println("my value is "+pos);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}