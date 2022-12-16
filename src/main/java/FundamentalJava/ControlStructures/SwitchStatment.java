package FundamentalJava.ControlStructures;

import java.util.Scanner;

public class SwitchStatment
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
//        System.out.println("tell us your favoriate laptop brand name");
//        String brand=scan.nextLine();

        int number=3;

        switch (number)
        {
//            case  "Hp" :
//                System.out.println("your fav is HP");
//                break;
//            case "Lenovo":
//                System.out.println("your fav is Levono");
//                break;
//            case "Acer":
//                System.out.println("your fav is Acer");
//                break;
//            default:
//                System.out.println("your favoriate is not matching");

            case  1:
                System.out.println("your rank is One");
                break;
            case 2:
                System.out.println("your rank is Two");
                break;
            case 3:
                System.out.println("your rank is Three");
                break;
            default:
                System.out.println("your are holding.....");
        }

    }
}
