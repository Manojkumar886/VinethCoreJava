package FundamentalJava;

import java.util.Scanner;

public class ScannerProcess
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Name");
        String name=scan.nextLine();
        System.out.println("Enter your Age");
        int age=scan.nextInt();
        System.out.println("Enter your 12th Percentage");
        float percentage=scan.nextFloat() ;
        System.out.println("Tell us your mobile no");
        long mobileno=scan.nextLong();
        System.out.println("My name is "+name);
        System.out.println("my age is "+age);
        System.out.println("your 12 th percentage is "+percentage);
        System.out.println("my mobile no is"+mobileno);
        System.out.println("Thank You");
    }
}
