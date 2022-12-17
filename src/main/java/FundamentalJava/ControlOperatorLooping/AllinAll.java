package FundamentalJava.ControlOperatorLooping;


import java.util.Scanner;

public class AllinAll
{
    static
    {
        System.out.println("Welcome to Anitha Enterprises");
    }
    public static void main(String[] args)
    {
        do {
            Scanner scan=new Scanner(System.in);
            System.out.println("Which purpose of laptop you need \n currently available \n IT \n ACCOUNTS \n GAMES \n STUDENTUSE");
            String  usage=scan.next();
            switch (usage)
            {
                case "IT":
                    System.out.println("your are asked IT professional Laptop \n currently available");
                    System.out.println("Please tell us what amount of laptop you buy");
                    int price=scan.nextInt();
                    if(price>=45000 && price <=55000)
                    {
                        System.out.println(price+" this price of laptops are \n HP \n LENOVO -v5 &-v6");
                        String type=scan.next();
                        switch (type)
                        {
                            case "HP":
                                System.out.println(type+"this type specifications are gen-11 and silver colour.....");
                                break;
                            case "LENOVO-v5":
                                System.out.println(type+"this type specifications are gen-10 and black colour ram-4......etc");
                                break;
                            default:
                                System.out.println("not available...");
                        }
                    } else if (price>60000)
                    {
                        System.out.println(price+" this price of laptops are \n APPLE \n DELL");
                        String type=scan.next();
                        switch (type)
                        {
                            case "APPLE":
                                System.out.println(type+"this type specifications are gen-11 and silver colour.....");
                                break;
                            case "DELL":
                                System.out.println(type+"this type specifications are gen-10 and black colour ram-4......etc");
                                break;
                            default:
                                System.out.println("not available...");
                        }
                    }
                    break;
                case "ACCOUNTS":
                    break;
                case "GAMES":
                    break;
                case "STUDENTUSE":
                    break;
                default:
                    System.out.println(usage+" currently not available...!");
            }
        }while (true);


    }
}
