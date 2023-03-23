package Array;

import java.util.Arrays;

public class Employee {
    public static void main(String[] args) {

        int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        //specific value of an array
        System.out.println(a[2]);//30

        System.out.println(a.length);//lenght

        /*for (int i=0;i<=5;i++){
            System.out.println(a[i]);

        }*/

        System.out.println(Arrays.toString(a));


    }
}
