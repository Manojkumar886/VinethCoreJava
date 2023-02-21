package FundamentalJava.Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class WriteanEncrpt
{
    public static void main(String[] args) throws IOException {
        File file=new File("E:\\EncrptFile.txt");
//        file.createNewFile();
//
//        System.out.println(file.getName()+" has created succesfully");
        FileOutputStream fos=new FileOutputStream(file);
        DeflaterOutputStream dos=new DeflaterOutputStream(fos);
        String basiccontent="File concept is provided to encrpt method .that method name for DeflaterOutputStream";
        
        dos.write(basiccontent.getBytes());
        
        dos.close();
        fos.close();

    }
}
