package July.ex_03082024.ex_28072024;

public class Person {


    String size;
    int ssc;
    String gender;

    Person() {//Default Constructor.It should be only one
        System.out.println("Default Constructor");
    }

    Person(String givenSize, int givenSsc, String givenGender) {
        //Param Constructor,It can be multiple as per combination of Params/Parameters
        System.out.println("Param/Parameter Constructor");
        this.ssc = givenSsc;
        this.gender = givenGender;
        this.size = givenSize;
        System.out.println("The Gender is " + givenGender +
                "The Size Is" + givenSize +
                "The Role No" + givenSsc);
    }

    Person(String givenSize, String givenGender) {
        System.out.println("Param/Parameter Constructor");

        this.gender = givenGender;
        this.size = givenSize;
        System.out.println("The Gender is " + givenGender +
                "The Size Is" + givenSize);
    }

    Person(Person copy) {
        //Copy Constructor to copy the existing params constructor
        this.gender = copy.gender;
        this.size = copy.size;
        System.out.println("The Gender is " + gender +
                "The Size Is" + size);
    }


        void walk(){}
        void talk(){}
        void roll(){}

}