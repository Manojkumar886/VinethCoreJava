package FundamentalJava.LoopingConcept;

import java.util.Scanner;

public class DemoWhileLoop
{
    public static void main(String[] args)
    {
//        int age=20;
//        while(age>=18)
//        {
//            System.out.println("your eligible to vote..."+age);
//
//        }
//        for(int i=0;i<=10;)
//        {
//            System.out.println("welcome to zealous academy");
//        }
        Scanner scan=new Scanner(System.in);
        System.out.println("available mobile count");
        int available=scan.nextInt();
        int amount=0,topayable=0,quantity=0;
        while (available>0)
        {
            System.out.println("Enter the number of mobile you want");
            quantity=scan.nextInt();
            if(quantity>available)
            {
                System.out.println("Stack available " +available);
            }
            else
            {
                topayable=(quantity*20000);
                System.out.println("please tell us enter your amount");
                amount=scan.nextInt();
                if(amount>=topayable)
                {
                    System.out.println("your are bought a realme mobile count is "+quantity);
                    available-=quantity;
                }
                else {
                    System.out.println("insufficient amount");
                }
            }
        }

    }
}
