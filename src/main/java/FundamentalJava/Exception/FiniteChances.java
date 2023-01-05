package FundamentalJava.Exception;

import java.util.Scanner;

public class FiniteChances
{
    private String myvalue="Infinite chances in exception handling using by java languages";

    public void extracting(int loop)
    {
        Scanner scan=new Scanner(System.in);
        try
        {
            System.out.println("enter the first index value");
            int start=scan.nextInt();
            System.out.println("enter the last value");
            int end=scan.nextInt();
            System.out.println(myvalue.substring(start,end));
        }
        catch(StringIndexOutOfBoundsException exe)
        {
            System.out.println(exe);
            System.out.println("Start value is 0 -end value is "+myvalue.length());
            if(loop<3)
            {
                loop++;
                extracting(loop);
            }
            else {
                System.out.println("Max attempts is over....");
            }
        }

    }
    public static void main(String[] args) {
       FiniteChances chance=new FiniteChances();
       chance.extracting(1);
    }
}
