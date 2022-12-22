package FundamentalJava.ArrayCRUDL;

import java.util.Scanner;

public class ReadingAnArray
{
    public static void main(String[] args)
    {
        int exp[]={5,2,0,3,10,8,1,12,4,1,6};
        System.out.println(exp.length);
        //read by index 3
        Scanner scan=new Scanner(System.in);
//        System.out.println("tell us which position to read a data");
//        int pos=scan.nextInt();
//        System.out.println(pos+" in hte position value is  "+exp[pos]);

        //read between range
        System.out.println("enter the start and end to read between those");
        System.out.println("start value is ");
        int start=scan.nextInt();
        System.out.println("end value is");
        int end =scan.nextInt();
        for(;start<end;start++ )
        {
            System.out.print(exp[start]+",");
        }


    }
}
