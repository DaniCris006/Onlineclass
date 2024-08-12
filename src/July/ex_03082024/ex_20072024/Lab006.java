package July.ex_03082024.ex_20072024;

import java.util.Scanner;

public class Lab006 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Score");
        int score= sc.nextInt();
        char grade = 'F';
        if(score>=90 && score <=99){grade='A';}
        else if (score>=80 && score <=89) {grade='B';}
        else if (score>=70 && score <=79) {grade='C';}
        else if (score>=60 && score <=69) {grade='D';}
        else if (score>=35 && score <=59) {grade='E';}
        else if (score<34){grade = 'F';}
       if (score>100) {
            System.out.println("Value is Wrong");
        }
        else {
            System.out.println("Grade is " +grade);}

    sc.close();
    }}





