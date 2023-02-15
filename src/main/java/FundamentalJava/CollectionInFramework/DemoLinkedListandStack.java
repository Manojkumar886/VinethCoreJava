package FundamentalJava.CollectionInFramework;

import java.util.LinkedList;
import java.util.Stack;

public class DemoLinkedListandStack
{
    public static void main(String[] args)
    {
//        LinkedList list1=new LinkedList(); //Generic
//        LinkedList<Character> list2=new LinkedList<Character>();//non -generic
        LinkedList<Integer> list1=new LinkedList<Integer>();
        list1.add(56);
        list1.add(89);
        list1.add(565);
        list1.addFirst(99);
        list1.add(4,11);

        System.out.println("List all values"+list1);
        list1.remove(2);
        list1.removeFirst();//Starting point
        System.out.println("remove with index"+list1);
        System.out.println("checking in progressn 11 -"+list1.contains(11));
        System.out.println("my value is "+list1.getLast());  //get using index,start,first
        System.out.println("11 number is change to "+list1.set(2,22));
        System.out.println(list1);
        System.out.println(list1.indexOf(22));
//        list1.clear();
//        System.out.println(list1);

        Stack obj=new Stack(); //generic

        obj.push("Manojkumar");
        obj.push(987654876765l);
        obj.push(8.9f);
        obj.push('s');

        System.out.println("Stack values"+obj);

        obj.pop();
        System.out.println("Stack values"+obj);
        System.out.println("obj peek value is "+obj.peek());





    }
}
