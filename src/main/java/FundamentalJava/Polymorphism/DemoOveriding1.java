package FundamentalJava.Polymorphism;

import java.util.Arrays;

public class DemoOveriding1 //run time polymorphism
{
    public void mystudentvalue(double salary,double income)
    {
        String studentvalue[]={"Vineth","Thivin","Thilak","Dhayalan"};
        System.out.println(Arrays.toString(studentvalue));
        double minus=salary-income;
        System.out.println(minus);

    }
}
