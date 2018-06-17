package home.agromova.triangle;

public enum TriangleType {
    EQUILATERAL("equilateral"),
    ISOSCELES("isosceles"),
    RIGHT_TRIANGLE("right_triangle"),
    OTHER("other");

    private String text;


    TriangleType(String text) {
        this.text = text;
    }

    public String toString() {
        return this.text;
    }

    public static TriangleType fromString(String text) {
        for (TriangleType b: TriangleType.values()) {
            if (b.text.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}
