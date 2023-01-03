package FundamentalJava.Exception;

import java.io.IOException;

public class CompiletimeException
{
    CompiletimeException()
    {
        System.out.println("Welcome to All");
    }
    public static void main(String[] args) throws IOException,InterruptedException {
           CompiletimeException exe=new CompiletimeException();
//        int aa=01;
//        System.out.println(aa);
        java.lang.Runtime run= java.lang.Runtime.getRuntime();

        Process pro;

        pro=run.exec("notepad");
        Thread.sleep(5000);
        pro=run.exec("calc");


    }
}

//class Runtime
//{
//    private static Runtime run=new Runtime(); //object name  is run-
//    private Runtime()
//    {
//
//    }
//    public static java.lang.Runtime getRuntime()
//    {
//        return run;
//    }
//}