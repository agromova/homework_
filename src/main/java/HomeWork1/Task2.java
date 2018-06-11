package HomeWork1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Enter a five-digit number:");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int firstFigure = number % 100000 / 10000;
        int secondFigure = number % 10000 / 1000;
        int thirdFigure = number % 1000 / 100;
        int fourthFigure = number % 100 / 10;
        int fifthFigure = number % 10;

        System.out.println(firstFigure);
        System.out.println(secondFigure);
        System.out.println(thirdFigure);
        System.out.println(fourthFigure);
        System.out.println(fifthFigure);
    }
}
