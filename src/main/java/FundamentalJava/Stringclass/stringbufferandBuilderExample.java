package FundamentalJava.Stringclass;

public class stringbufferandBuilderExample
{
    public static void main(String[] args)
    {
        String st=new String("HelloThivin");        //immutable
        st=st.concat("Thilak");

        // append-add,insert,replace,reverse......
        StringBuffer buff=new StringBuffer("HelloVineth");  //mutable
        StringBuilder builder=new StringBuilder("Hello Manoj");   //mutable
        System.out.println(buff);
        buff.append("JavaDeveloper");  //mutable
        System.out.println(buff);   //HelloVinethJavaDeveloper
        buff.insert(5,"Student");
        System.out.println(buff);   //HelloStudentVinethJavaDeveloper
        buff.replace(12,18,"Manoj");
        System.out.println(buff);   //HelloStudentManojJavaDeveloper
        buff.reverse();
        System.out.println(buff);   //repoleveDavaJjonaMtnedutSolleH
        buff.reverse();
        System.out.println(buff);   //HelloStudentManojJavaDeveloper



    }



}
