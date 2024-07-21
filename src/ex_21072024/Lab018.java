package ex_21072024;

import java.util.Scanner;

public class Lab018 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int value=sc.nextInt();
        while (value<=100){
            System.out.println("The value is " +value);
            value++;
        }
    }
}
