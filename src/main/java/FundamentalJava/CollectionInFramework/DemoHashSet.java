package FundamentalJava.CollectionInFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class DemoHashSet
{
    public static void main(String[] args)
    {
        HashSet<Character> set=new HashSet<Character>(); //
        set.add('A');
        set.add('B');
        set.add('C');
        set.add('D');
        set.add('E');
        set.add('F');
        set.add('F');

        Iterator i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        TreeSet<Character> set1=new TreeSet<Character>();

        set1.addAll(set);
        System.out.println(set1);




    }
}
