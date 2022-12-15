package FundamentalJava.Operators;

public class BitwiseOperator
{
    public static void main(String[] args)
    {
        int myXvalue=100;
        int myYvalue=75;
        System.out.println("X value is "+myXvalue+"  Y value is "+myYvalue+"bitwise AND operator value is ="+(myXvalue&myYvalue));
        System.out.println("X value is "+myXvalue+"  Y value is "+myYvalue+"bitwise Exclusive OR operator value is ="+(myXvalue^myYvalue));
        System.out.println("X value is "+myXvalue+"  Y value is "+myYvalue+"bitwise Inclusive OR operator value is ="+(myXvalue|myYvalue));

    }
}
