package FundamentalJava.Polymorphism;

public class DemoOverriding2 extends DemoOveriding1
{
    public void mystudentvalue(double salary,double income)
    {
        System.out.println("Welcome to run time polymorphism");
        double matching=income+salary;
        System.out.println("my values is minus" +matching);
    }

    public static void main(String[] args)
    {

         DemoOveriding1 obj=new DemoOveriding1();
         obj.mystudentvalue(56000,89000);
         DemoOverriding2 obj1=new DemoOverriding2();
         obj1.mystudentvalue(23,34);


//upcasting - referenced by parent classs but object created by child class
        DemoOveriding1 obj2=new DemoOverriding2();
        obj2.mystudentvalue(78989,79678);
    }

}
