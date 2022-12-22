package FundamentalJava.ArrayCRUDL;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class UpdatingAnArray
{
    public static void main(String[] args)
    {
        int [] height={120,123,140,160,180,190,164,176,146};
        System.out.println("my array value length is "+height.length);

        System.out.println("my before updating values "+ Arrays.toString(height));
        Scanner scan=new Scanner(System.in);
        System.out.println("please tell us which index you want update");
        int index=scan.nextInt();
        System.out.println("what is new value to update a index of"+index);
        int mynewvalue=scan.nextInt();
        height[index]=mynewvalue;//updating or replacing
        System.out.println("After updating an value in array of height"+ Arrays.toString(height));
    }
}
