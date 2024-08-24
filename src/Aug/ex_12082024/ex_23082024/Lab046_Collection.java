package Aug.ex_12082024.ex_23082024;

import java.util.ArrayList;
import java.util.Objects;

public class Lab046_Collection {
//    Collection Framework
//

//
//We prefer below classes and Interfaces in place of Arrays.
//
//Legacy APIs are provided
//
//Legacy Classes
//Vector
//Stack
//Properties
//Hash table
//Dictionary
//
//Legacy Interface
//Enumeration (cursor)

//    Arraylist
public static void main(String[] args) {
    ArrayList arr= new ArrayList<>();
    arr.add("SAM");
    arr.add(123);
    arr.add("fisher");
    System.out.println(arr);
    arr.set(1,556);
    for(Object o: arr){
        System.out.println(o);// print in one by one
    }
    System.out.println(arr);
    System.out.println(arr.isEmpty());
    arr.clear();

    System.out.println(arr.isEmpty());
}
}
