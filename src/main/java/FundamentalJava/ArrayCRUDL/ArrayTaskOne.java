package FundamentalJava.ArrayCRUDL;

import java.sql.Array;
import java.util.Arrays;

public class ArrayTaskOne
{
    private int [][] array={{55,65,75},{15,25,35},{45,85,95}};
    // [55,65,75,35,95,85,45,15,25]
    public void connecting()
    {
        for(int row=0;row<array.length;row++)
        {
            for(int col=0;col<array[row].length;col++) {
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }

        int[] spiral=new int[array.length* 3];
        int row=2,col=0,index=0;
        for(;col< array.length;col++,index++)
        {
            spiral[index]=array[row][col];
        }
        col--;row--;
        for(;row>=0;row--,index++)
        {
            spiral[index]=array[row][col];
        }
        col--;row++;
        for(;col>=0;col--,index++)
        {
            spiral[index]=array[row][col];
        }
        row++;col++;
        for(;col<=1;col++,index++)
        {
            spiral[index]=array[row][col];
        }
//        int row=0,col=0,index=0;
//        for(;col< array.length;col++,index++) //col-3
//        {
//            spiral[index]=array[row][col];
//        }
//        col--;row++;  //col=2,row=1
//        for(;row< array.length;row++,index++) //row=3
//        {
//            spiral[index]=array[row][col];
//        }
//        row--;col--;  //col=2,row=2
//        for(;col>=0;col--,index++)   //col=-1
//        {
//            spiral[index]=array[row][col];  //row=2
//        }
//        row--;col++;  //col=0 ,row=1
//        for(;col<=1;col++,index++)
//        {
//            spiral[index]=array[row][col];
//        }

        System.out.println(Arrays.toString(spiral));

    }

    public static void main(String[] args)
    {
        ArrayTaskOne task=new ArrayTaskOne();
        task.connecting();



    }
}
