package home.agromova.calculator;

public class Multiplication implements BinaryOperations{

    @Override
    public double findResultFor(double x, double y) {
        return x * y;
    }
}
