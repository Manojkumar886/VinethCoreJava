package FundamentalJava.Inheritance.MultiLevelInheritance;

public class Student extends EngineerStudent
{
    public void student()
    {
        System.out.println("must need 12th and 10th mark sheet");
    }

    public static void main(String[] args)
    {
        Student boys=new Student();
        boys.ArtsGroup();

        boys.EngineerDepartment();

        boys.student();


    }
}
