package FundamentalJava.Encapsulation;

public class AccountDetails
{
    private String AccountHolder;
    private long AccountNumber;
    private double AccountBalance;

    public AccountDetails()
    {
        super();
    }

    public String getAccountHolder()
    {
        return AccountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        AccountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        AccountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "AccountDetails{" +
                "AccountHolder='" + AccountHolder + '\'' +
                ", AccountNumber=" + AccountNumber +
                ", AccountBalance=" + AccountBalance +
                '}';
    }

    public AccountDetails(String AccountHolder, long accountNumber, double accountBalance)
    {
        this.AccountHolder = AccountHolder;
        AccountNumber = accountNumber;
        AccountBalance = accountBalance;
    }
}
