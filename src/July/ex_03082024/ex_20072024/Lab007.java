package July.ex_03082024.ex_20072024;

import java.util.Scanner;

public class Lab007 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Sides value");
        int value1=sc.nextInt();
        int value2=sc.nextInt();
        int value3=sc.nextInt();

        if ((value1==value2) && (value2==value3) && (value3==value1))
        {
            System.out.println("The angle is Proper");}
        else if((value1==value2) || (value2==value3) || (value3==value1)){
            System.out.println("two sides proper");
        }
        else {
            System.out.println("Three Improper sides");
        }

    }
}
