package FundamentalJava.Constructor;

public class Constructortypes
{
    int myfamilymemberscount;
    String myfamilyheadname;
    double myfamilyMothlyincome;

    public Constructortypes() //default constructor
    {
        System.out.println("Welcome to All in constructor");
    }
    //this keyword -
    public Constructortypes(int myfamilymemberscount,String header,double myfamilyMothlyincome)  //parameterized constructor
    {
        this.myfamilymemberscount=myfamilymemberscount;
        myfamilyheadname=header;
        this.myfamilyMothlyincome=myfamilyMothlyincome;
        System.out.println("my family count is " +myfamilymemberscount +"\n my head name is "+myfamilyheadname+" \n my income is "+myfamilyMothlyincome);
    }

    public static void main(String[] args)
    {
        //   classname   objname=new constructor();
        Constructortypes basic=new Constructortypes(); //initialize an object

        Constructortypes basic1=new Constructortypes(4,"Manoj",40000.0);


    }
}
