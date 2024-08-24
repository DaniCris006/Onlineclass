package Aug.ex_12082024.ex_24082024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lab052 {
    public static void main(String[] args) {
        //Student - Name , id
        Student s1= new Student(4, "Dani");
        Student s2=new Student(3,"Cris");
        Student s3=new Student(2,"Ethan");
        Student s4=new Student(1,"Nathan");
        //Arraylist
        List arr= new ArrayList();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        Collections.sort(arr);
        System.out.println(arr);

        //Linked List
        List lin= new LinkedList();
        lin.add(s1);
        lin.add(s2);
        lin.add(s3);
        lin.add(s4);
        System.out.println(lin);
        Collections.sort(lin);
        System.out.println(lin);

    }
}
class Student implements Comparable<Student>{
    private Integer id;
    private String name;

    public Student(Integer id, String name){
        this.id=id;
        this.name=name;
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override// Sort by ID
    public int compareTo(Student o) {
        return Integer.compare(this.id,o.id);
    }
//    @Override// Sort by Name
//    public int compareTo(Student o) {
//        return CharSequence.compare(this.name,o.name);
//    }

}