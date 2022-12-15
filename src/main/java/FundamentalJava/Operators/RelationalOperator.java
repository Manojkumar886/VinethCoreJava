package FundamentalJava.Operators;

import java.util.Scanner;

public class RelationalOperator
{
    public static void main(String[] args)
    {
        int age;
        Scanner scan=new Scanner(System.in);
        System.out.println("Tell us your age please");
        age =scan.nextInt();
        System.out.println("your age is "+age+" - eligible to term insurance "+(age>=40));

    }
}
