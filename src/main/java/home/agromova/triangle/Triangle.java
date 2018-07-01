package home.agromova.triangle;

import static java.lang.Math.sqrt;


public class Triangle {
    private Point a;
    private Point b;
    private Point c;


    Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private float getAB() {
        return a.getDistToPoint(b);
    }

    private float getBC() {
        return b.getDistToPoint(c);
    }

    private float getCA() {
        return c.getDistToPoint(a);
    }

    public float getPerimeter() {
        return  getAB() + getBC() + getCA();
    }

    public float getSquare() {
        float halfPerim = getPerimeter() / 2;
        return (float)sqrt(getPerimeter() * (halfPerim - getAB()) * (halfPerim - getBC()) *
                (halfPerim - getCA()));
    }

    private boolean isEquilateral() {
        return (getAB() == getBC() || getBC() == getCA() || getCA() == getAB()); //равнобедреный
    }

    private boolean isIsosceles() {
        return (getAB() == getBC() && getBC() == getCA()); //равносторонний
    }

    private boolean isRightAngled() {

        float sAB = getAB() * getAB();
        float sBC = getBC() * getBC();
        float sCA = getCA() * getCA();

        boolean s1 = sAB == sBC + sCA;
        boolean s2 = sBC == sAB + sCA;
        boolean s3 = sCA == sAB + sBC;

        return (s1 || s2 || s3);

    }

    public TriangleType getType() {

        if (isIsosceles()) {
            return TriangleType.ISOSCELES;
        }
        if (isRightAngled()) {
            return TriangleType.RIGHT_TRIANGLE;
        }
        if (isEquilateral()) {
            return TriangleType.EQUILATERAL;
        }

        return TriangleType.OTHER;
    }

    public String toString() {

        return "[a(" + a + ") b(" + b + ") c(" + c + ")]";

    }

}
