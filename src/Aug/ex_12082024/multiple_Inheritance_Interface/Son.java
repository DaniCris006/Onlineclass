package Aug.ex_12082024.multiple_Inheritance_Interface;

public class Son implements mother,father{
    @Override
    public void home() {
        System.out.println("My home");
    }

    @Override
    public void money() {
        System.out.println("total money 1000");
    }
}
