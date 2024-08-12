package July.ex_03082024.ex_28072024;

public class Lab030_constructor {
    public static void main(String[] args) {
        Person s=new Person();//
// Person() can define in the another public class[Person] . we can use it.This is called default Constructor
        // Special method with no return .
        //It can be only one
Person D= new Person("Twenty",35,"Male");
//Param Constructor,It can be multiple as per combination of Params/Parameters
  Person copy= new Person(D);

            System.out.println(copy);


    }
}
