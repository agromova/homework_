package HomeWork1;
import java.util.Scanner;

/*
Написать программу решающую следующие уравнения. Переменные x,y,z,n инициализируется перед решением уравнения.
Каждое решение оформить в отдельном статическом методе.

        x - (y + 123) / z * n  		=> считаем в long
        (x + (50 - y * z) / n) - x 	=> считаем в int
        x / (y * (z - 1) - 564) + n 	=> считаем в float
        -x / -y + z / (n + 15) 		=> считаем в double
*/


public class Task1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("Enter four int numbers:");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int n = sc.nextInt();

        int res = (x + (50 - y * z) / n) - x;

        System.out.printf("(%d + (50 - %d * %d) / %d) - %d = %d \n\r", x, y, z, n, x, res);
    }
    private static void task2() {

        System.out.println("Enter four long numbers:");

        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();
        long n = sc.nextLong();

        long res = x - (y + 123) / z * n;

        System.out.printf("%d - (%d + 123) / %d * %d  = %d \n\r", x, y, z, n, res);

    }

    private static void task3() {

        System.out.println("Enter four float numbers:");

        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float z = sc.nextFloat();
        float n = sc.nextFloat();

        float res = x / (y * (z - 1) - 564) + n;

        System.out.printf("%f / (%f * (%f - 1) - 564) + %f = %f \n\r", x, y, z, n, res);

    }

    private static void task4() {

        System.out.println("Enter four double numbers:");

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double n = sc.nextDouble();

        double res =  -x / -y + z / (n + 15);

        System.out.printf(" -%f / -%f + %f / (%f + 15) \n\r", x, y, z, n, res);

    }
}
