package FundamentalJava.Exception;

import java.util.Scanner;

public class PurposeOfException
{
    public static void main(String[] args)
    {
        String myvalue="Exception topic is more important in fundamental java";
        Scanner scan=new Scanner(System.in);
        try
        {
            System.out.println("Please tell us which index value is you want");
            System.out.println(myvalue.charAt(scan.nextInt()));//
        }
        catch (StringIndexOutOfBoundsException  str)
        {
            System.out.println(str+" "+" INDEX NUMBER SHOULD BE LESS THEN  "+myvalue.length());
            System.out.println(myvalue.charAt(scan.nextInt()));
        }
        finally
        {
            System.out.println("Thank You...!");
        }
    }
}
