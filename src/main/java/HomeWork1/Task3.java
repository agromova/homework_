package HomeWork1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Enter coordinates of vector:");

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        double vectorLength = Math.sqrt(x * x + y * y + z * z);

        double xOfUnitVector = x / vectorLength;
        double yOfUnitVector = y / vectorLength;
        double zOfUnitVector = z / vectorLength;

        System.out.printf("The coordinates of Unit Vector are: (%f, %f, %f)", xOfUnitVector,
                yOfUnitVector, zOfUnitVector);

    }
}

