package FundamentalJava.CollectionInFramework;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;

public class DemoTreemap
{
    public static void main(String[] args)
    {
        TreeMap<String,Integer> obj=new TreeMap<String,Integer>();
        obj.put("Manojkumar",12);
        obj.put("Vineth",11);
        obj.put("Annamalai",10);

        System.out.println(obj);
        System.out.println(obj.get("Vineth"));
        System.out.println(obj.containsKey("Annamalai"));
        System.out.println(obj.containsValue(12));


        TreeMap<String,Supermarket> masala=new TreeMap<String,Supermarket>();

        Supermarket csuper=new Supermarket("Sakthimasala",200,20.0);
        Supermarket csuper1=new Supermarket("Aachimasala",600,70.0);

        masala.put("Manojkumar",csuper);
        masala.put("Vineth",csuper1);
        masala.put("Annamalai",csuper1);
        masala.put("Razak",csuper1);

        for(Map.Entry m: masala.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }


    }

}
