package Aug.ex_12082024.ex_14082024.multiple_Inheritance_Interface.Static_Keyword;

public class Lab041 {
    public static void main(String[] args) {
        ATB a= new ATB("Dani");
        System.out.println(a.getName());
        System.out.println(ATB.course_name);
        ATB.assignment();
    }


}
class ATB{

    {
        System.out.println("Default calling option");
// this is default option will trigger before stating the application/automation
    }
    static {
        // this is default option will trigger before stating the application/automation even before this "{}"
        System.out.println("Static Default calling option");
    }
   private  String name;
    static String course_name = "ATB";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {
        this.name = name;
    }
    static void assignment(){
        System.out.println("Do assignmnet");
    }
}