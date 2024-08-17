package Aug.ex_12082024.ex_15082024;

public class Exc extends Throwable {
//    Try and Catch
public static void main(String[] args) {
    String name = "Dani" ;
    try{
        name.trim();
        int a=10/0;
    }catch (Exception e){// Exception,Throwable also allowed instead of Error
        System.out.println(e.getMessage());
       // System.exit(0); to stop the process we can use this
    }finally {
        System.out.println("Then print this");
    }

}

}
