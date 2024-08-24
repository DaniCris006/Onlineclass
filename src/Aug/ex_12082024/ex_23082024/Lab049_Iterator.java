package Aug.ex_12082024.ex_23082024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab049_Iterator {
    public static void main(String[] args) {
//        List data = new ArrayList<>();// this allow all data type
//        List<Boolean> data = new ArrayList();// this allow Booolen data type
//        List<Integer> data = new ArrayList();// this allow Integer data type
       List<String> data = new ArrayList();// this allow String data type
        data.add("String2");
        data.add("string");
        data.add("String");
        data.add("String1");
for(String str:data){ // this loop can be used in some collection framework only
    System.out.println(str);
}

        Iterator<String> itr = data.iterator(); // Iterator is will look of next value and it can use in every Collection framwork
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}