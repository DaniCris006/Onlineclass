package July.ex_03082024.ex_21072024;

import java.util.Scanner;

public class Lab013 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");
        int value=sc.nextInt();

        for(int i=value;value<=100;++value){
            System.out.println("value is" +value);
        }sc.close();
    }
}
