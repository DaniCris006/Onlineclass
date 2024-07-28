package ex_28072024;

public class Lab021 {
    public static void main(String[] args) {
        int[] number={10,20,30,40,50,60};
        //     Index={0 ,1 ,2 ,3 ,4 ,5} if we try the value for 6 it will throw an error out of bound length
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]*2);

        }
        System.out.println(number[6]);//if we try the value for 6 it will throw an error out of bound length
        //length means = 1,2,3,4,5,6 --> mentioned as number.length
        //Index Means = 0,1,2,3,4,5 --> mentioned as "i"
        // if there is no index then the value is Zero Ex: number[7]
    }
}
