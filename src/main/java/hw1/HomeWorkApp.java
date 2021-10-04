package hw1;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 0, 1, 0, 0, 1 };
        inverseFunc(arr);
        int[] arr1 = new int[100];
        fillArray(arr1);
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessSix(arr3);
        int[][] arr4 = new int[5][5];
        fillUnits(arr4);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int len = sc.nextInt();
        System.out.println("Введите число заполнения массива:");
        int initialValue = sc.nextInt();
        doArray(len, initialValue);
        int[] arr5 = {1, 3, 34, 23, 234, 63, 89, -490, 0};
        findMinMax(arr5);
        int[] arr6 = {1, 2, 3, 4, 2};
        System.out.println(calcEquals(arr6));
    }

    public static void inverseFunc(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void multiplyLessSix(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6){
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillUnits(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j || j == arr[i].length - i-1){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
           System.out.println();
        }
    }

    public static void doArray(int len,  int initialValue){
       int[] arr = new int[len];
       for (int i = 0; i < arr.length; i++){
           arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void findMinMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
            } else if(arr[i] > max){
                max= arr[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }

    public static boolean calcEquals(int[] arr){
        int sumLeft = 0;
        int sumRight = 0;
         for(int i = 0; i < arr.length; i++){
             sumLeft = sumLeft + arr[i];
                for(int j = i+1; j < arr.length; j++) {
                    sumRight = sumRight + arr[j];
                    if (sumLeft == sumRight) {
                        return true;
                    }
                    sumRight = 0;
                }

        }
        return false;
    }
}

