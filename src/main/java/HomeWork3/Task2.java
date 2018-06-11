package HomeWork3;
import java.util.Scanner;

//Пользователь вводит строку.
//Программа разбивает строку на слова, и “переворачивает” каждое слово,
//формирует из новых слов предложение и выводит его на экран.


public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        String[] s = inputString.split(" ");

        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length; i++) {
            for (int n = s[i].length() - 1; n >= 0; n--) {
                word.append(s[i].charAt(n));
            }
            System.out.print(word);
            word.delete(0, word.length());
            System.out.print(" ");
        }

    }

}

