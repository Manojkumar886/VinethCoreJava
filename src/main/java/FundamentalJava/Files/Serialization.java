package FundamentalJava.Files;

import java.io.*;

public class Serialization
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("E:\\FundamentalJava\\FileinSerializable.txt");
//        file.createNewFile();

        FileInputStream fis=new FileInputStream(file);

        ObjectInputStream ois=new ObjectInputStream(fis);

        Mobileapplication app=(Mobileapplication)  ois.readObject();

        System.out.println(" MObile Brand :"+app.MobileBrand+"\n"+"Mobile Model :"+app.MobileModel+"\n"+"MObileRam :"+app.RAM+"\n"+"Mobile Price :"+app.price);

        ois.close();
        fis.close();
//        FileOutputStream fos=new FileOutputStream(file);
//
//        ObjectOutputStream oos=new ObjectOutputStream(fos);
//
//        Mobileapplication app=new Mobileapplication();
//        app.MobileBrand="Oppo";
//        app.MobileModel="REAlME-1";
//        app.RAM=4;
//        app.price=78000;
//
//        oos.writeObject(app);
//        System.out.println(oos);
//
//        fos.close();
//        oos.close();
    }
}

class Mobileapplication implements Serializable
{
    String MobileBrand;
    String MobileModel;
    int RAM,price;
}
