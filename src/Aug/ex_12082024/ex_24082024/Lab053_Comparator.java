package Aug.ex_12082024.ex_24082024;

import java.util.*;

public class Lab053_Comparator {
    public static void main(String[] args) {
    //Student - Name , id
    Students s1= new Students(4, "Dani");
    Students s2=new Students(3,"Cris");
    Students s3=new Students(2,"Ethan");
    Students s4=new Students(1,"Nathan");
    //Arraylist
//    List arr= new ArrayList();
//    arr.add(s1);
//    arr.add(s2);
//    arr.add(s3);
//    arr.add(s4);
//    Collections.sort(arr);
//    System.out.println(arr);

    //Linked List
    List lin= new LinkedList();
    lin.add(s1);
    lin.add(s2);
    lin.add(s3);
    lin.add(s4);
    System.out.println(lin);
//    Collections.sort(lin);//Comparable
    Collections.sort(lin,new Sortbyname());
        System.out.println(lin);
        Collections.sort(lin,new sortbyid());
    System.out.println(lin);

}
}

class Sortbyname implements Comparator<Students>{

    @Override
    public int compare(Students o1, Students o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class sortbyid implements Comparator<Students>{
    @Override
    public int compare(Students o1, Students o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}

class Students  {
    private Integer id;
    private String name;

    public Students(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


