package FundamentalJava.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class ReadanEncrpt
{
    public static void main(String[] args) throws IOException {
        File file=new File("E:\\EncrptFile.txt");
        FileInputStream fis=new FileInputStream(file);

        InflaterInputStream iis=new InflaterInputStream(fis);

        int size=fis.available();
        byte[] value=new byte[size];
        iis.read(value);
        System.out.println(new String(value));
        fis.close();
        iis.close();

    }
}
