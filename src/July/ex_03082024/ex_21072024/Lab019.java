package July.ex_03082024.ex_21072024;

import java.util.Scanner;

public class Lab019 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=sc.nextInt();
        int fact=1;
        for (int i=1;i<=n;i++)
        {
            fact=fact*i;

        }
        System.out.println(fact);
        sc.close();
    }

}
