package July.ex_03082024.ex_20072024;

import java.util.Scanner;

public class Lab012 {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value");
    char value = input.next().toLowerCase().charAt(0);
    switch(value)
    {
        case 'a','e','i','o','u' -> System.out.println("Its a Vowel");
        default -> System.out.println("Not a vowel ");
    }
    input.close();
}
}