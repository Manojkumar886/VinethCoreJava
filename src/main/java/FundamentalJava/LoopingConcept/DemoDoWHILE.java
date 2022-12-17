package FundamentalJava.LoopingConcept;

import java.util.Scanner;

public class DemoDoWHILE
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        int staff=10,count=0;
        float time=0;
        do {
            System.out.println(staff+" staff- Enter your login time");
            time=scan.nextFloat();
            if(time>9.15f)
            {
                System.out.println(time+"your are late comer chances to loss of pay");
                count++;
            }
            else
            {
                System.out.println(staff+"th staff  your login time"+time);
            }
            staff--;

        }while (staff>0);

        System.out.println("this month late comer count"+count);
    }
}
