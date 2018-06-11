package HomeWork3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Пользователь задает длину массива (положительное число от 10 до 100).
//Программа заполняет массив случайными числами. Выводит массив и все числа массива кратные 3-ем.

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Enter number from 10 to 100");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();

        int[] array1 = new int[arrayLength];
        String numbers = " ";

        for (int i = 0; i < arrayLength; i++) {
            Random rand = new Random();
            array1[i] = rand.nextInt();

            if (array1[i] % 3 == 0) {
                numbers += array1[i] + " ";
            }

        }

        System.out.println(Arrays.toString(array1));
        System.out.println(numbers);

    }

}
