package HomeWork2;/*
Напишите программу, которая строит “сетку” 4 х 4:
*****************
*   *   *   *   *
*****************
*   *   *   *   *
*****************
*   *   *   *   *
*****************
*   *   *   *   *
*****************
Ширина определяемая пробелами, вводится пользователем с шагом 3. Минимальная ширина составляет 3 пробела, максимальная 9.
Количество строк высоты определяется как ширина деленная на 3.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Please enter 3, 6 or 9");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < 4; i++) {
            System.out.println(doLineWithoutGaps(n));
            for (int m = 0; m < n / 3; m++) {
                System.out.println("");
            }
            System.out.println(doLineWithGaps(n));
            for (int m = 0; m < n / 3; m++) {
                System.out.println("");
            }

        }
        System.out.println(doLineWithoutGaps(n));
    }

    public static String doLineWithoutGaps (int a) {
        String lineWithoutGaps = "";

        int numberOfAsterisks = 5 + 4 * a;

        for (int i = 0; i < numberOfAsterisks; i++) {
            lineWithoutGaps += "*";
        }
        return lineWithoutGaps;
    }

    public static String doLineWithGaps (int a) {
        String lineWithGaps = "";

        int stringLength = 5 + 4 * a;

        for (int i = 0; i < stringLength; i++) {
            if (i == 0) {
                lineWithGaps += "*";
            } else if (i % (a + 1) == 0){
                lineWithGaps += "*";
            } else {
                lineWithGaps += " ";
            }
        }
        return lineWithGaps;
    }
}
