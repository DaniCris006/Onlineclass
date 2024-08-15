package Aug.ex_12082024;

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
