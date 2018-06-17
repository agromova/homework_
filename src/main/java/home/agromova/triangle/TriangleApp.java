package home.agromova.triangle;
import java.util.Scanner;


public class TriangleApp {
    public static void main(String[] args) {

        Triangle [] triangles = Triangle.generateTriangles(100000);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        TriangleType type = TriangleType.fromString(input);

        if (type == null) {
            System.out.println(input + " incorrect type!");
            System.exit(1);
        }

        int index = Triangle.find(triangles, type);

        if (index >= 0) {
            System.out.println("Index: " + index + " Triangle: " + triangles[index]);
            System.out.println("Perimeter: " + triangles[index].getPerimeter());
            System.out.println("Square: " + triangles[index].getSquare());
        } else {
            System.out.println("Треугольник не найдет");
        }

    }

}
