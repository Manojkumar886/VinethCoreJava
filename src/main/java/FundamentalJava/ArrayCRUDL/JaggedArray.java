package FundamentalJava.ArrayCRUDL;

public class JaggedArray
{
    public static void list(int[][] list2)
    {
        for(int list1[]:list2)
        {
            for(int list:list1)
            {
                System.out.print(list+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int [][] trainBoxCount=new int[5][];
        trainBoxCount[0]=new int[6];
        trainBoxCount[1]=new int[5];
        trainBoxCount[2]=new int[4];
        trainBoxCount[3]=new int[3];
        trainBoxCount[4]=new int[2];

        int count=0;
        //value input
        for(int boxcount=0;boxcount< trainBoxCount.length;boxcount++)
        {
            for(int seatcount=0;seatcount<trainBoxCount[boxcount].length;seatcount++)
            {
                trainBoxCount[boxcount][seatcount]=count+=10;
            }
        }

        //value print
        for(int boxcount=0;boxcount< trainBoxCount.length;boxcount++)
        {
            for(int seatcount=0;seatcount<trainBoxCount[boxcount].length;seatcount++)
            {
                System.out.print(trainBoxCount[boxcount][seatcount]+" ");
            }
            System.out.println();
        }


//    JaggedArray train=new JaggedArray();
//        train.list(trainBoxCount);
        list(trainBoxCount);

    }
}
