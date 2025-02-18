package Aug.ex_12082024.ex_24082024;

import java.util.Scanner;

public class Lab056_grade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Score");
        int score=sc.nextInt();
        char grade='F';
        if (score>=90 && score<=100){
            grade='A';
        } else if
        (score>=80 && score<=89){
            grade='B';
        }
        else {
            System.out.println("Your are grade-->"+grade);
    }
        System.out.println("Your Grade-->"+grade);
}}
