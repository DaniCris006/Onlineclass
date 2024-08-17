package Aug.ex_12082024.ex_15082024.Wrapper_class;
 //Wrapper class is to change Prinative data type to Object
//Ex. int a=2 can change to Integer a=2 so this can be changed to string also
public class Lab042 {
    int a = 10;
    String s=String.valueOf(a);
    String s1=Integer.toString(a);

    double d=23.3;
    String sd=String.valueOf(d);
    String sd1=Double.toString(d);

    String sp="123";
    int px=Integer.parseInt(sp);
    Integer pxw=Integer.valueOf(sp);

}
