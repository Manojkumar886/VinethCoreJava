package FundamentalJava;

public class VariablesType
{
    static
    {
        System.out.println("___________Welcome to Indian Bank1___________");
    }
    static double Balance=34000;
    String BranchName="Namakkal";
    public static void main(String[] args)
    {
        String AccountHolderName="Vineth";//Instance Variable
        System.out.println("my accountHolder name is "+AccountHolderName);
        VariablesType obj=new VariablesType();
        obj.AcoountDetails();
        creditCard();
       // System.out.println(Balance);
       // System.out.println(BranchName);

    }

    public void AcoountDetails()
    {System.out.println("Branch Name is "+BranchName);//global variable
        Long AccountNo=54637283928l;
        String IfscCode="IDIB020001";//Local Variable
        System.out.println("Account no is "+AccountNo);
        System.out.println("Account Code "+IfscCode);
        System.out.println(Balance);
    }

    private static void creditCard()
    {
        System.out.println("not eligible for your account in credit card.........");
    }
}
