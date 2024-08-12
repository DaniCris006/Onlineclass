package July.ex_03082024.ex_28072024;

import java.util.Arrays;
// How to find MAXIMUM SALARY
public class Lab025 {
    public static void main(String[] args) {
        int[] salary={5,7,13,8,5,27,32,4,15};
        int max=salary[0];
        int min=salary[0];
//        for (int i = 0; i < salary.length; i++) {
//            if(salary[i]>max){
//                max= salary[i];
//            }
//            if(min>salary[i]){
//                min= salary[i];
//            }
//
//        }
//        System.out.println(max);
//        System.out.println(min);
        Arrays.sort(salary);
        System.out.println(salary[salary.length-1]);
        System.out.println(salary[0]);
    }
}
