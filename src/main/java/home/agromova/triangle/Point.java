package home.agromova.triangle;

import static java.lang.Math.sqrt;


public class Point {

    private final float x;
    private final float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getDistToPoint(Point p) {
        float dX = (this.x - p.x);
        float dY = (this.y - p.y);

        return (float) sqrt(dX * dX + dY * dY);
    }

    public String toString() {
        return this.x + ";" + this.y;
    }

}


