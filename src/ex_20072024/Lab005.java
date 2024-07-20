package ex_20072024;

import java.util.Scanner;

public class Lab005 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int Input_value=sc.nextInt();
        System.out.println(Input_value);
        if(Input_value-10>=20){
            System.out.println("working");
        }else {
            System.out.println("not working");}
    }
}
