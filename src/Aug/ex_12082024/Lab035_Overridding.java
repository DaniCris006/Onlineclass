package Aug.ex_12082024;

public class Lab035_Overridding {
    public static void main(String[] args) {
        Pitbull p= new Pitbull();
        p.bark();

        Dog d= new Dog();
        d.bark();

        Dog pd= new Pitbull();
        pd.bark();// this is overridden
        //pd.howl;// not possible

//        Pitbull dp= new Dog();
//        dp.bark();
    }
}
