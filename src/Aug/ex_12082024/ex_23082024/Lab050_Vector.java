package Aug.ex_12082024.ex_23082024;



import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab050_Vector {
    public static void main(String[] args) {
        List<String> data = new ArrayList();// this allow String data type
        data.add("String2");
        data.add("string");
        data.add("String");
        data.add("String1");
        System.out.println(data);
        Vector v= new Vector();
        v.add("String2");
        v.add("string");
        v.add("String");
        v.add("String1");
        System.out.println(v);

        // Vector has some problem
//        Its thread safe,Synchronised
//        It will be time consuming
//        One by one usage
//        Slower
    }
}
