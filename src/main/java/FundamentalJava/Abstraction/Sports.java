package FundamentalJava.Abstraction;

import lombok.Data;

import java.lang.reflect.Array;
import java.util.Arrays;

@Data
public abstract class Sports
{
    private  String [] stacks={"MERN","PYTHON","JAVA","SPRING","REACT JS"};

    public void callingARRAY()
    {
        System.out.println(Arrays.toString(stacks));
    }

    public abstract void nonJS(); //no implementation -interface
}
