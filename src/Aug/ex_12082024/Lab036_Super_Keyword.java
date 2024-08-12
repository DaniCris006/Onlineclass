package Aug.ex_12082024;


public class Lab036_Super_Keyword  {
    public static void main(String[] args) {
        car s= new car();
        s.display();
        s.message();
    }



}
class car extends vehicle{ public int maxspeed=280;
    void display(){
        System.out.println("Car speed is -->"+ this.maxspeed);
        System.out.println("Vehicle speed is -->"+ super.maxspeed);//Super is the access the parent method value
    }
}
class vehicle{
    public int maxspeed= 180;
    void message(){
        System.out.println("Hello Vehicle");
    }}