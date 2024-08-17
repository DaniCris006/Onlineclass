package Aug.ex_12082024.ex_17082024;

public enum Constant {
    URL("www.hec.com"),
    Login_page("www.value.vom");

    private String name; // assiging the value as string or int
    Constant(String name){ // creation of constructor with function
        this.name=name; //this show the value of the give variable or title
    }
    public String getvalue(){//  this method to access the value given inside the variable or title
        return name; // to get in the output as value check Lab044
    }
}
