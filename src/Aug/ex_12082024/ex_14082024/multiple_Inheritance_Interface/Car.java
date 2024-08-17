package Aug.ex_12082024.ex_14082024.multiple_Inheritance_Interface;

 class Car extends Engine {


    @Override
    void engine() {
        System.out.println("Engine");

    }

    @Override
    void partgear() {
        System.out.println("gearbox");
    }
    @Override
    void keys(){
        System.out.println("keys");
    }
}
