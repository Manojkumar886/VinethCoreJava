package FundamentalJava.Inheritance.hybridInheritance;

public class Human  extends Girl implements GirlBestiee,GirlFriend
{

    @Override
    public void Bestiee() {
        System.out.println("Your bestie is your best friend. She spent the day hanging out with her bestie.");
    }

    @Override
    public void GF() {
        System.out.println("A girlfriend is a female friend, acquaintance or partner, usually a female companion with whom one is platonically, romantically, or sexually involved.");
    }

    public static void main(String[] args) {
        Human people=new Human();
        people.Women(); //normal class
        people.GF();   //interface class
        people.Bestiee(); //interface class
    }
}
