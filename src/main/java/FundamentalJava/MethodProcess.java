package FundamentalJava;

import FundamentalJava.CollectionInFramework.DemoMaps.SampleMOdifiers;

public class MethodProcess extends  SampleMOdifiers
{
    public void processing()
    {
        System.out.println("This method is using by return type and not using by arguments");
    }
    public static void Checking()
    {
        System.out.println("This method is static block ");
    }

    public void Adding(double dol)
    {
        System.out.println(dol+140+" this is a double value");
    }
    public int getting()//no arguments and no return statement
    {
        int a=10;
        float b=a;
        System.out.println(b+"b value - "+a+"a Value ");
        return a;
    }

    public int gettingused(int add)//no return keyword but parameter is passed
    {
        int minus=add-100;

        System.out.println("my value is used for"+minus);
        return minus;
    }

    public static void main(String[] args)
    {
        MethodProcess obj=new MethodProcess();
        obj.processing();
        obj.getting();
        obj.Adding(60.0);
        obj.gettingused(200);
      //  MethodProcess.Checking();
      Checking();

        SampleMOdifiers access=new SampleMOdifiers();
        access.accessModifier();
        obj.protectedmodifier();

    }
}
