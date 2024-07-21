package ex_20072024;

import java.util.Scanner;

public class Lab008 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int value=sc.nextInt();
        int f=value%3;
        int b=value%5;
        if(value>=101){
            System.out.println("Out of Program");
        }
        else if (f==0 && b==0){
            System.out.println("FizzBuzz");
        } else if (b==0) {
            System.out.println("Buzz");
        }else if (f==0){
            System.out.println("Fizz");
        }
            else {
            System.out.println("Not a FizzBuzz");
        }
        sc.close();
        }


    }
