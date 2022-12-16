package FundamentalJava.ControlStructures;

import java.util.Scanner;

public class DemoIFStatement
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Tell us What is your number check in odd or even");
        int number=scan.nextInt();

        if(number%2==0)
        {
            System.out.println(number+" this  number is even .....");
        }
        else {
            System.out.println(number+" this number is not even.....");
        }


    }
}
