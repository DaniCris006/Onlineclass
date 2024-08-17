package Aug.ex_12082024.ex_17082024;

public class Lab045_throe {public static void main(String[] args) {
    String name = "Dani" ;
    int b=0;
    try{
        name.trim();
        int a=10/b;
    }catch (Throwable exc){// Exception,Throwable also allowed instead of Error
        System.out.println(exc);
        // System.exit(0); to stop the process we can use this
    }finally {
        System.out.println("Then kindly print this");
    }

}
}
