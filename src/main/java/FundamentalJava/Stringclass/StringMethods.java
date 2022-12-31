package FundamentalJava.Stringclass;

import java.util.Arrays;

public class StringMethods
{
    public static void main(String[] args)
    {
        String name="Manojkumar";  //literal
        System.out.println(name);

        String obj=new String("Set of values"); //non-literal-object creation
        System.out.println(obj);
        String name1=new String("ManojkumarMadheswaran");
        name=name.concat("Madheswaran");  //Immutable
        System.out.println(name);
        System.out.println(name.charAt(8));
        System.out.println(name.equals(name1));
        String pair="Vinethkumar"; //70
        String pair1="vineth";  //110    70-110=-40
        System.out.println(pair.compareTo(pair1));
        System.out.println(pair.compareToIgnoreCase(pair1));
        System.out.println(pair1.endsWith("eth"));
        System.out.println(pair.startsWith("V"));
        System.out.println(name1.replace("Manojkumar","Pavithra"));
        System.out.println(name1);
        System.out.println(name1.substring(5));//first index
        System.out.println(name1.substring(5,10));//start,end
        System.out.println(pair.contains("th"));
        String checking="  Vineth is java full stack student   ";
        System.out.println(checking);
        System.out.println(checking.trim());

        String Spliting=new String("He is java developer completed with in three months ");
        System.out.println(Spliting);
        String Spliting1[]=Spliting.split("e");

    //   System.out.println(Arrays.toString(Spliting1));

    }
}
