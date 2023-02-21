package FundamentalJava.Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DemoWriting
{
    public static void main(String[] args) throws IOException {

        File fileinput=new File("D:\\VinethFolder\\SampleFile.txt");

//        fileinput.mkdir();//Folder creation

//        fileinput.createNewFile();//file creation
//
//        System.out.println(fileinput.getName()+"has been file is created");

        FileOutputStream fos=new FileOutputStream(fileinput); //inside file is write a cpntent

        Scanner scan=new Scanner(System.in);

        System.out.println("please type a anyone content.that content is added inside a SampleFile.txt");
        String content=scan.nextLine();

        fos.write(content.getBytes());

        System.out.println(fileinput.getName()+"inside a file ,content is written");

        fos.close();
        scan.close();
    }
}
