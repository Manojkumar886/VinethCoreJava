package FundamentalJava.CollectionInFramework.DemoMaps;

public class SampleMOdifiers
{
    public void accessModifier()
    {
        System.out.println("this is a public access modifiers");
    }
    private static void privatemodifier()
    {
        System.out.println("this is private keyword");
    }
    protected void protectedmodifier()
    {
        System.out.println("this is protected keyword in modifier");
    }

    public static void main(String[] args) {
    privatemodifier();//private modifier
        SampleMOdifiers modi=new SampleMOdifiers();
        modi.protectedmodifier();
    }

}

