package home.agromova.triangle;
import static java.lang.Math.random;

public final class Triangles {

    private Triangles() {
    }

    private static float generateRandom() {
        return (float) -1000 + (float) (random() * (1000 - (-1000)));
    }

    public static Triangle[] generateTriangles(int count) {

        Triangle[] arrayOfTriangles = new Triangle[count];

        for (int i = 0; i < count; i++) {
            Point a = new Point(generateRandom(), generateRandom());
            Point b = new Point(generateRandom(), generateRandom());
            Point c = new Point(generateRandom(), generateRandom());
            arrayOfTriangles[i] = new Triangle(a, b, c);
        }

        return arrayOfTriangles;
    }

    public static int find(Triangle[] triangles, TriangleType triangleType) {
        for (int i = 0; i < triangles.length; i ++) {
            if (triangles[i].getType() == triangleType) {
                return i;
            }
        }
        return -1;
    }


}
