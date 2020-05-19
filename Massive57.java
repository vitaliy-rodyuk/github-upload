package javaStart;

import java.util.Arrays;
import java.util.Scanner;

public class Massive57 {
    public static void main(String[] args) {
        int [] arr1=new int[10];
        arr1[0]=28;
        arr1[1]=25;
        arr1[2]=350;
        arr1[3]=46;
        arr1[4]=55;
        arr1[5]=9;
        arr1[6]=7;
        arr1[7]=55;
        arr1[8]=10;
        arr1[9]=111;
        System.out.println("arr1 "+Arrays.toString(arr1));

        Arrays.sort(arr1);
        System.out.println("arr1 "+Arrays.toString(arr1));

        Scanner scanner=new Scanner(System.in);
        System.out.println("Заполните пожалуйста массив");
        for (int i = 0; i <10; i++) {
            System.out.println("Введите число");
            int a = scanner.nextInt();
            arr1[i] = a;

        }
        System.out.println("arr1 "+Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("arr1 "+Arrays.toString(arr1));




    }
}
