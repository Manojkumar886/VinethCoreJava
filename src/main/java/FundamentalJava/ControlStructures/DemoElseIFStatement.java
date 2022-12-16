package FundamentalJava.ControlStructures;

import java.util.Scanner;

public class DemoElseIFStatement
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String statenameOne=scan.nextLine();

        String statenameTwo=scan.nextLine();

        if(statenameTwo=="Bihar")
        {
            System.out.println("my statename is Bihar");
        }
        else if (statenameOne=="Tamil Nadu")
        {
            System.out.println("my wonderful statename is Tamilnade");
        }
        else if ((statenameTwo==statenameOne )||(statenameOne!=statenameTwo))
        {
            System.out.println("Statename 1 and statename 2 is diffenent");
        }
        else
        {
            System.out.println("all statename is are wrong......");
        }
    }
}
