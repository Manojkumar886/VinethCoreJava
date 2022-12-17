package FundamentalJava.LoopingConcept;

import java.util.Scanner;

public class DemoForLoop
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
//        for(int i=0;i<=5;i++)
//        {
//            System.out.println("my number is "+i);
//        }
        for(int vacancy=4;vacancy>=0;)
        {
            System.out.println("what is your experience ");
            int exp=scanner.nextInt();
            if(exp>=4 && exp<=8)
            {
                System.out.println("your are required successfully - vacancy no"+vacancy);
                vacancy--;
            }
            else
            {
                System.out.println("your not eligible for a job...");
            }
        }
    }
}
