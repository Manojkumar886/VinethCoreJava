package FundamentalJava.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoReading
{
    public static void main(String[] args) throws IOException {
        File fileinput=new File("E:\\Web-Development-Traning\\Web-Development Theory\\HTML.txt");

        FileInputStream fis=new FileInputStream(fileinput);

//        int size=fis.available();
//
//        byte[] temp=new byte[size];
//
//        fis.read(temp);
//
//        String mydata=new String(temp);
//
//        System.out.println(mydata);

        int asci=0;
        while((asci= fis.read())!=-1)
        {
            System.out.println((char)asci+" -"+asci);//Typecasting
        }

        fis.close();


    }
}
