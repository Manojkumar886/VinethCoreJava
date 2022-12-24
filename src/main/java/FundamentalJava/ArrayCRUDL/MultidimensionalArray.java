package FundamentalJava.ArrayCRUDL;

import java.util.Scanner;

public class MultidimensionalArray
{
    public void Apartment(String[][] matching)
    {
        for(int floor=0;floor< matching.length;floor++)
        {
            for(int house=0;house< matching[floor].length;house++)
            {
                Scanner scan=new Scanner(System.in);
                System.out.println("Floor no is"+floor+" house no count is "+house+" Tenent name is");
                matching[floor][house]=scan.next();
            }
        }
    }
    public void list(String [][] list2)
    {
        for(String list1[]:list2)
        {
            for(String list:list1)
            {
                System.out.print(list+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
//        int[][] numbers={{1,2,3},{4,5,6},{7,8,9}};
//
//        for(int row=0;row<3;row++)
//        {
//            for(int column=0;column<3;column++)
//            {
//                System.out.print(numbers[row][column]+" ");
//            }
//            System.out.println();
//        }
        String [][] apartment=new String[3][4];
        MultidimensionalArray multi=new MultidimensionalArray();
        multi.Apartment(apartment);
        multi.list(apartment);


    }
}
