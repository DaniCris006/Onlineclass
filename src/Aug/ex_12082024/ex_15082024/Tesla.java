package Aug.ex_12082024.ex_15082024;

public class Tesla implements Engine{
    @Override
    public void startengine() {
        System.out.println("Start the Engine");
    }

    @Override
    public void stopengine() {
        System.out.println("Stop the Engine");
    }
}
