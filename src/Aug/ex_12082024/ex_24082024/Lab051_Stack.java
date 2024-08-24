package Aug.ex_12082024.ex_24082024;

import java.util.Stack;

public class Lab051_Stack {
    public static void main(String[] args) {
        //Stack,Vector[legacy] we wont use in Automation for 95%
        // Stack like Push,pop,peek,search
        // we cant remove or add in easy way
        Stack s= new Stack();
       s.push("Node");//Push is like add
        s.add("Node1");
        s.add("Node2");
        s.add("Node3");
        System.out.println(s);
        System.out.println(s.peek());// getting the last value
        System.out.println(s.pop());//pop for remove list
        System.out.println(s.peek());
    }
}
