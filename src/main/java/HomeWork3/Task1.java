package HomeWork3;
import java.util.Scanner;

//Пользователь вводит последовательность символов.
//        Программа должна определить, является ли последовательность палиндромом.
//        Вывести ДА, если последовательность символов палиндром и НЕТ в противном случае.

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder newStr = new StringBuilder();

        for (int i = (str.length() - 1); i >= 0; i--) {
            newStr.append(str.charAt(i));
        }
        System.out.println(newStr);

        if (str.compareToIgnoreCase(newStr.toString()) == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}


