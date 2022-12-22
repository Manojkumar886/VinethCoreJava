package FundamentalJava.ArrayCRUDL;

import java.util.Arrays;

public class PassingAnArrayValuesinMethod
{
    public static void PassingAnArray(double [] income)
    {
        income[0]=3.2;
        income[5]=7.5;
    }

    public static void main(String[] args)
    {
        double [] salary={2.3,5.6,4.5,7.6,8.7,5.7,10};

        System.out.println("before updating an array"+ Arrays.toString(salary));
        PassingAnArray(salary);
        System.out.println("After updating an array value "+Arrays.toString(salary));

    }
}
