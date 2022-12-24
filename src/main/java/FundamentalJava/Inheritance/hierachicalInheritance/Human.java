package FundamentalJava.Inheritance.hierachicalInheritance;

public class Human extends Teacher
{
    public static void main(String[] args)
    {
        Human man=new Human();
        man.teacher();
        man.human();
        Teacher tech=new Teacher();
        tech.teacher();
        tech.human();

    }

}
