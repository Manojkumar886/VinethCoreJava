package FundamentalJava.Operators;

public class LogicalOperator
{
    public static void main(String[] args)
    {
        int waterbottlecount=20;
        int tiffenBox=33;
        double PencilCount=33;
        int myage=12;


        System.out.println(waterbottlecount<=tiffenBox && PencilCount!=waterbottlecount);  //true && true =true

        System.out.println(myage>=tiffenBox || tiffenBox>=waterbottlecount); //true || true= true, true|| false=true(opposite)

        System.out.println(!(PencilCount==tiffenBox));//opoosite performance
    }
}
