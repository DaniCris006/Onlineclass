package Aug.ex_12082024.ex_24082024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab054_Hashset {
    public static void main(String[] args) {
        Set hs = new HashSet();// It doesnt have NO order
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Banana");
        hs.add("Banana");// Duplicate will get skip
        hs.add("banana");
        hs.add("Watermellon");
        hs.add(null);
        System.out.println(hs);
       Set Lhs= new LinkedHashSet();// It  have any order
        Lhs.add("Apple");
        Lhs.add("Orange");
        Lhs.add("Banana");
        Lhs.add("Banana");// Duplicate will get skip
       Lhs.add("banana");
        Lhs.add("Watermellon");
        Lhs.add(null);
        System.out.println(Lhs);
       Set ts= new TreeSet();// It  will auto sort
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("Banana");
        ts.add("Banana");// Duplicate will get skip
        ts.add("banana");
        ts.add("Watermellon");
        //ts.add(null);// null not allowed in Treeset
        System.out.println(ts);
    }
}
