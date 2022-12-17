package FundamentalJava.ArrayCRUDL;

import java.util.Arrays;
import java.util.Scanner;

public class InsertingAnArray
{
    public static void main(String[] args)
    {
        String [] StudentName=new String[5];
//
        StudentName[4]="Saran";
        System.out.println(Arrays.toString(StudentName));
        Scanner scan=new Scanner(System.in);
        for(int pos=0;pos< StudentName.length;pos++)
        {
            System.out.println("what is your name");
            StudentName[pos]=scan.next();
        }
        System.out.println(Arrays.toString(StudentName));

    }
}
