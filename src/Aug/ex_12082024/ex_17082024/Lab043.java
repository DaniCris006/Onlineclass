package Aug.ex_12082024.ex_17082024;

public class Lab043  {
    public static void main(String[] args) {
        String value = "216";
        int S = Integer.parseInt(value);
        System.out.println(S);
        In c = new In();
        In.Ioc cg=c.new Ioc();  // To access ineer class
        cg.drive();


    }}
        class In{
            public In(){
                System.out.println("car");}
                class Ioc{
                    void drive(){
                        System.out.println("drive");
                    }
                }
            }


