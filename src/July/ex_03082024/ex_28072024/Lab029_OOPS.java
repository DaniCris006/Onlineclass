package July.ex_03082024.ex_28072024;

public class Lab029_OOPS { // call the function from other group
    public static void main(String[] args) {
    Person dani = new Person(); //Person is created as class.If a class is public we can call with in the folder ,
        // If want to call outside the folder need to import as comment in top.
        // Without import if we make attribute and Functionality as public Ex: public String name;
    dani.size="one"; //Inside  the class the size all mentioned as attributes/Data Members/Properties
    dani.ssc= 2;
    dani.gender="male";
    dani.talk();//Inside the class the talk mention as functionality/Methods/Behaviour
    dani.roll();

    }


/*Blue Print - Class
              *Attribute/Data Members/Properties/Instance Variable
              Ex: String name:
              * String Hands:
              * int roll no:
              *Functionality/Methods/Behaviour
              void walk(){}
              void talk(){}

*/



}
