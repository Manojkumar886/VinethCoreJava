package FundamentalJava.Exception;

public class ThrowKey
{
    static void checking(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("your age is not vaild....");
        }
        else {
            System.out.println("welcome to our vote count....!");
        }
    }
    public static void main(String[] args)
    {
        checking(15);
    }
}
