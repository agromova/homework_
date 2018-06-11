package HomeWork4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Math.random;
import static java.lang.Math.sqrt;


class Program {
    public static void main(String[] args) {
        Triangle [] triangles = Triangle.generateTriangles(1000000);
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        int index = Triangle.find(triangles, type);

        if (index >= 0) {
            System.out.println("Index: " + index);
            System.out.println(triangles[index]);
        }



    }

}


class Point {
    float x;
    float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float findDistance(Point pointTo) {
        float newX = this.x - pointTo.x;
        float newY = this.y - pointTo.y;
        return (float) sqrt(newX * newX + newX * newY);
    }

    @Override
    public String toString() {
        return "(" + this.x + ";" + this.y + ")";
    }
}


class Triangle {
    Point a;
    Point b;
    Point c;

    private float distA;
    private float distB;
    private float distC;

    private int [] typeMap;

    static Map<String,Integer> triangleTypes = generateMap();

    private static Map<String, Integer> generateMap() {
        Map<String, Integer> types = new HashMap<String, Integer>();
        types.put("a", 0);
        types.put("b", 1);
        types.put("c", 2);
        types.put("d", 3);
        return types;
    }


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.distA = this.c.findDistance(this.a);
        this.distB = this.a.findDistance(this.c);
        this.distC = this.b.findDistance(this.a);
        this.typeMap = this.getType();

    }

    @Override
    public String toString() {
        return "Triangle[a" + this.a + " b" + this.b + " c" + this.c + "]";
    }

    float findPerimeter() {
        return this.distA + this.distB + this.distC;
    }

    float findSquare() {
        return (float) sqrt(findPerimeter() * (findPerimeter() - this.distA) * (findPerimeter() - this.distB) *
                (findPerimeter() - this.distC));
    }

    private int [] getType() {
        int[] type = new int[4];

        if  (this.distA == this.distB || this.distB == this.distC || this.distC == this.distA){
            type[0] = 1; // is equilateral
        } else {
            type[0] = 0;
        }

        if (this.distA == this.distB && this.distA == this.distC){
            type[1] = 1; // is isosceles
        } else {
            type[1] = 0;
        }
        if (this.distA == sqrt(this.distB * this.distB + this.distC * this.distC) || this.distB == sqrt(this.distA * this.distA + this.distC * this.distC) ||
                this.distC == sqrt(this.distB * this.distB + this.distA * this.distA)) {
            type[2] = 1; // is right-angled
        } else {
            type[2] = 0;
        }
        if (this.distA != this.distB && this.distB != this.distC && this.distC != this.distA) {
            type[3] = 1; // is random
        } else {
            type[3] = 0;
        }

        return type;
    }


    public static Triangle[] generateTriangles(int count) {

        Triangle[] arrayOfTriangles = new Triangle[count];

        for (int i = 0; i < count; i++){
            Point a = new Point((float) random(), (float) random());
            Point b = new Point((float) random(), (float) random());
            Point c = new Point((float) random(), (float) random());
            arrayOfTriangles[i] = new Triangle(a, b, c);
        }


        return arrayOfTriangles;
    }

    public static int find(Triangle[] triangles, String triangleType) {
        for (int i = 0; i < triangles.length; i ++) {
            if (triangles[i].typeMap[Triangle.triangleTypes.get(triangleType)] == 1) {
                return i;
            }
        }
        return -1;
    }

}




