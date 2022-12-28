package FundamentalJava.Polymorphism;

public class DemoMethodoverloding//compile time polymorphism
{
    public void calculate()
    {
        System.out.println("this is a overloading process");
    }
    public void calculate(int a ,int b)
    {
        int add=a+b;
        System.out.println("my calculate method is working by addition of two number value is "+add);
    }
    public  void calculate(String myname,String myfrdname)
    {
        String connect=myname+myfrdname;
        System.out.println("my name and my freidn name is "+connect);
    }

    public static void main(String[] args) {
        DemoMethodoverloding overloading=new DemoMethodoverloding();
        overloading.calculate();
        overloading.calculate(35 ,65);
        overloading.calculate("Manoj","Mani");
    }

}
