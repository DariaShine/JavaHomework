package hw1;

import java.util.Arrays;

public class HomeWorkApp {

    public static void main(String[] args) {
        int a = 100;
        int b = -90;
        int c = 2400;
        String str = "Строка напечатана ";

        boolean isSumInRange = sumTwoNumbers(a, b);
        System.out.println(isSumInRange);

        signOfNumber(a);
        signOfNumber(b);

        boolean isNegative = negativeNumber(b);
        System.out.println(isNegative);

        printStr(a,str);

        boolean isLeapYear = leapYear(c);
        System.out.println(isLeapYear);
    }

    public static boolean sumTwoNumbers(int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        return (result >= 10 && result <= 20);
    }

    public static void signOfNumber(int number) {
        if(number>= 0){
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean negativeNumber(int number) {
        return (number>= 0 ? (false) : (true));
    }

    public static void printStr(int number, String str){
        for (int i = 1; i <= number; i++){
            System.out.println(str + i + " раз");
        }
    }

    public static boolean leapYear(int с) {
        boolean result = false;

        if(с % 4 == 0) {
            if(с % 400 == 0){
                result = true;
            } else if(с % 100 == 0){
                result = false;
            } else {
                result = true;
            }
            return result;
        } else {
            return false;
        }
    }

}

