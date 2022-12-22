package FundamentalJava.ArrayCRUDL;

import java.util.Scanner;

public class SearchingAnArray
{
    public void searching(String []  heronames,int countno)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Tell us what is your favoriate actor");
        String favoriate=scan.next();
        for(int index=0;index<countno;index++)
        {
            if(favoriate.equalsIgnoreCase(heronames[index]))
            {
                System.out.println(favoriate+" your favoriate actor value is founded  = "+index);
                return ;
            }
        }
        System.out.println(favoriate+" your favoriate actor has not founded");

    }
    public static void main(String[] args)
    {
        String ActorsName[]={"Vijay","Ajith","Kamal","Rajini","Simbhu","VijaySethupathi","Siva","Jeeva","sivakarthickeyan","Karthick"};

        int mycount= ActorsName.length;

        SearchingAnArray obj=new SearchingAnArray();
        obj.searching(ActorsName,mycount);

    }
}
