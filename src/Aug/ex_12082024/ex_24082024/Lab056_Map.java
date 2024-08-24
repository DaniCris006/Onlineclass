package Aug.ex_12082024.ex_24082024;

import java.util.*;

public class Lab056_Map {
    public static void main(String[] args) {
        //Map- key and value pair
        //Hashmap// view in random order
        Map hm= new HashMap();
        hm.put("Name","Dani");
        hm.put("Roll No","234");
        hm.put("Phone","9843947");
        System.out.println(hm+"Hashmap");
// Linked hashmap// View as it given
        Map lhm= new LinkedHashMap();
        lhm.put("Name","Dani");
        lhm.put("Roll No","234");
        lhm.put("Phone","9843947");
        System.out.println(lhm+"LinkedHashmap");
        // Tree hashmap // Sort by Value
        Map thm= new TreeMap();
        thm.put("Name","Dani");
        thm.put("Roll No","234");
        thm.put("Phone","9843947");
        System.out.println(thm+"Tree Map");
        // Weak hashmap // Similar to Treemap sort
        Map whm= new WeakHashMap();
        whm.put("Name","Dani");
        whm.put("Roll No","234");
        whm.put("Phone","9843947");
        System.out.println(whm+"Weak Map");

    }
}

