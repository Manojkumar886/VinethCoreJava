package FundamentalJava.InterfaceWITHmultipleInheritance;

public class person implements Moveable,Sleepable,Speakable
{
    @Override
    public void move()
    {
        System.out.println("All peoples are go to any places");
    }

    @Override
    public void speak()
    {
        System.out.println("say something in order to convey information or to express a feeling.");
    }
    public void Human()
    {
        System.out.println("Humans (Homo sapiens) are the most abundant and widespread species of primate, characterized by bipedalism and exceptional cognitive skills due to a large ...");
    }

    @Override
    public void sleep()
    {
        System.out.println("Sleep is a sedentary state of mind and body. It is characterized by altered consciousness, relatively inhibited sensory activity, reduced muscle activity ...");
    }
}
