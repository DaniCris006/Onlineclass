package ex_28072024;

import java.util.Scanner;

public class Lab024 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float[] marks=new float[5];
        for (int i=0;i<marks.length;i++)
        {
            System.out.println("Enter the marks of sub " + (i + 1));
            marks[i] = sc.nextInt();
        }
//        for (int i=0;i<marks.length;i++){
//            System.out.println("Marks of Sub "+(i+1) +";" +marks[i]);
//        } this loop only for showcase the calue
        float avg=(marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("Avg is -->" +avg);
        sc.close();
    }
}
