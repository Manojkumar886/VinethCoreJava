package FundamentalJava.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedCatch
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int clock=0,block=0;
        try
        {
            System.out.println("Enter your first value");
            clock=scan.nextInt();
            System.out.println("enter your second value");
            block=scan.nextInt();
            System.out.println(clock/block);
        }
        catch (InputMismatchException exe)
        {
            System.out.println(exe);
            Scanner scans=new Scanner(System.in);
            try
            {
                System.out.println("only used bu numerical numbers");
                System.out.println("Enter your first value");
                clock=scans.nextInt();
                System.out.println("enter your second value");
                block=scans.nextInt();
                System.out.println(clock/block);
            }
            catch(ArithmeticException exe1)
            {
                System.out.println(exe1);
                System.out.println("Cannot be used by zerro value");
                System.out.println("Enter your first value");
                clock=scans.nextInt();
                System.out.println("enter your second value");
                block=scans.nextInt();
                System.out.println(clock/block);
            }
        }
        finally
        {
            System.out.println("Thank You");
        }


    }
}
