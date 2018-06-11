package HomeWork2;//Есть целое положительное число (long).
//Программа должна определить сумму цифр из которых состоит число.
//Сумма цифр числа 15875 => 26

import java.util.Scanner;
//
public class Task2 {
    private static long a;

    public static void main(String[] args) {

        System.out.println("Please enter long number:");
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();

        int res = countSumOfDigits(number);
        System.out.println(res);


    }

    public static int countSumOfDigits(long a) {
        Task2.a = a;

        int sumOfDigits = 0;
        for (long i = a; i > 0; i = i / 10){
            sumOfDigits += i % 10;
        }
        return sumOfDigits;
    }
}
