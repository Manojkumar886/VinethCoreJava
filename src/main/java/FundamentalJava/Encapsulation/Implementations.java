package FundamentalJava.Encapsulation;

public class Implementations
{
    public static void main(String[] args)
    {
        AccountDetails account=new AccountDetails();//default constructor

        account.setAccountHolder("Manojkumar");
        account.setAccountBalance(23000);
        account.setAccountNumber(607182778292l);
        System.out.println(account.getAccountHolder());
        System.out.println(account);

        AccountDetails account1=new AccountDetails("vineth",7567876578687l,80000);

        System.out.println(account1);

    }
}
