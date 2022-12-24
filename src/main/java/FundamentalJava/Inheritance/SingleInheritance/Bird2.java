package FundamentalJava.Inheritance.SingleInheritance;

public class Bird2 extends Bird1
{
    public void parrot()
    {
        System.out.println("Parrot is bird");
    }

    public static void main(String[] args)
    {
        Bird2 birds=new Bird2();
        birds.parrot();
        birds.Peacock();

    }
}
