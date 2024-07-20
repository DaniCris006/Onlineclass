package ex_20072024;

import java.util.Scanner;

public class Lab011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value");
        int value = input.nextInt();
        switch (value) {
            case 1 -> System.out.println("Its an Electronic Engineer");
                case 2-> System.out.println("Its a Mechanical Engineer");
                     case 3 -> System.out.println("Its a Civil Engineer");
                          case 4 -> System.out.println("Its a Computer Engineer");
                               case 5 -> System.out.println("Its a Electric Engineer");


            default -> System.out.println("Invalid Number");
        }
    }
}
