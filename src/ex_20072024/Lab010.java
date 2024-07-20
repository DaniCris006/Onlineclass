package ex_20072024;

import java.util.Scanner;

public class Lab010 {public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the value");
    int value=input.nextInt();
    switch (value){
        case 1,2,3,4,5:
            System.out.println("Its an Electronic Gadget");
            break;
        case 6,7,8,9,10:
            System.out.println("Its an Mechanical Gadget");
            break;

        default:
            System.out.println("Invalid Number");
    }
}
}
