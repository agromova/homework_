package HomeWork2;
//Есть целое положительное число (long).
//Программа должна определить сумму цифр из которых состоит число.
//Сумма цифр числа 15875 => 26

import java.util.Scanner;
//
public class Task2 {

    public static void main(String[] args) {

        System.out.println("Please enter long number:");
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();

        long res = countSumOfDigits(number);
        System.out.println(res);


    }

    public static long countSumOfDigits(long number) {

        int sumOfDigits = 0;
        for (long i = number; i > 0; i = i / 10){
            sumOfDigits += i % 10;
        }
        return sumOfDigits;
    }
}
