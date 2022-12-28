package FundamentalJava.Abstraction;

public class DemoAbstruction extends  Sports
{
    public static void main(String[] args)
    {
        DemoAbstruction abstractionss=new DemoAbstruction();
        abstractionss.callingARRAY();
        abstractionss.nonJS();
    }

    @Override
    public void nonJS()
    {
        for(int i=0;i< getStacks().length;i++)
        {
            if(getStacks()[i].endsWith("N"))
            {
                System.out.println(getStacks()[i]);
            }
        }
    }
}

