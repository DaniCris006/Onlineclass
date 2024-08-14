package Aug.ex_12082024;

public class Lab037_Abstract_Interface {

// Abstraction
//    Abstract is a Keyword
//    Hiding Unnecessary value over the class and method
//    abstract is incomplete class which can complete by @override command in different class
//    abstract class
//    interface -  hiding the implementation we can user instead of class
//    Interface and implements same as class and extends
//    Multiple inheritance allowed in Interface
//    Inter
interface I{}
    class A{} // con
    class B{}
    abstract class C{}
    class Test1 extends  A{} // Ok?
    class Test2 extends B{}
    // class Test3 extends A,B{} // Multiple Inheritance
    class Test0 implements I{}
    interface I1{ }
    interface I2{}
    class Test4 implements I1,I2{} // multiple Inheritance with interface
    class Test5 extends A implements I1,I2{}
    //class Test6 implements I1 extends A{}// Ok
//interface I3 extends A{}
//interface I4 implements A{}
//interface I5 extends A,B{}
    interface I6 extends I1,I2{}
//interface I7  extends C{}


    public interface E {
        void startEngine();

        void stopEngine();

        default void haltingEngineJustStart() {
            System.out.println("Halt the Engine");
        }

        default void haltingEngineJustStop() {
            System.out.println("Halt the Engine");
        }

        static void M1() {
            System.out.println("M1");
        }

        void m2();
        void m3();
//   void m4(){
//       System.out.println("Not possible");
//   }
    }
}
