package Aug.ex_12082024.ex_14082024.multiple_Inheritance_Interface;

public class Lab033_OOPS {
    // Encapsulation
    // Polymorphism
    // Abstraction
    // This Keyword
    // Super Keyword
    // Static Keyword

    // ## Encapsulation : Its a Fundamental concept in OOPS
    // bundling of data and methods that operate on that data within a single unit
    // Data member should be private in nature
    //Methods with getter and setter only , you can access the data member / Attributes

// get can return value
    // set cant return value

// Getter or Setter  --In class select --Generate --Getter and setters and select the value
    public static void main(String[] args) {
        Lab034 test= new Lab034();
        System.out.println(test.getPassword());
        test.setPassword("usead");
        System.out.println(test.getPassword());
    }
}
//Example:
class Lab034{
    private String username;
    private String password;
    private int access_no;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccess_no(int access_no) {
        this.access_no = access_no;
    }

    public String getUsername(){
        return username;
    }
      public int getAccess_no(){
        return access_no;
    }
}
