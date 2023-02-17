package FundamentalJava.CollectionInFramework;

import FundamentalJava.CollectionInFramework.DemoMaps.SampleMOdifiers;

import java.util.ArrayList;
import java.util.Vector;

public class DemoArrayandVectorList
{
    public static void main(String[] args)
    {

        ArrayList obj1=new ArrayList();
        obj1.add("Manojkumar");
        obj1.add(8.2f);
        obj1.add("12-20-1223");
        obj1.add(2,100);
        obj1.add('A');
        obj1.add(8.2f);

        System.out.println("my array value is "+obj1);

        Vector obj2=new Vector();

        obj2.addAll(obj1);
        obj2.add(4,"Vineth");
        obj2.add(1,"Java Stack developer");

        System.out.println("my vector value is "+obj2);

        obj2.removeAll(obj1);//only removeed original value
        System.out.println("my value is "+obj2);

        obj2.retainAll(obj1);//only dubplicate value is value
        System.out.println("my retain value is "+obj2);
    }
}
