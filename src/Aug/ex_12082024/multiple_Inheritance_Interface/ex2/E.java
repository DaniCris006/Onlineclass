package Aug.ex_12082024.multiple_Inheritance_Interface.ex2;

public interface E {
//   using default and static Keyword we can complete a method in the interface .
// Static keyword value directly can access by Class name
    static void engine1(){
        System.out.println("start the engine 2");
    }
    default void engine(){
        System.out.println("start the engine");
    }

    void incomplet();
    void extend();
}
