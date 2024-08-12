package July.ex_03082024.ex_21072024;

import java.util.Scanner;

public class Lab017 {public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value");
    int value=sc.nextInt();
    for (int i=value;i<=10;i++){
        System.out.println("value is  " +i);
        if(i==5)
        {System.out.println("loop skip");
            continue;
            }
        System.out.println("loop continue");
    }

}

}
