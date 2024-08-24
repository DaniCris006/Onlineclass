package Aug.ex_12082024.ex_23082024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab047 {
    public static void main(String[] args) {
        List Marks= new ArrayList();
        Marks.add(100);
        Marks.add(20);
        Marks.add(35);
        Marks.add(89);
        Marks.add(01);
        Marks.add(96);
        System.out.println(Marks);
        Collections.sort(Marks);// Collections is Interface // Collection is for Class
        System.out.println(Marks);
    }
}
