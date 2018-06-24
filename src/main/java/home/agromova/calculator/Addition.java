package home.agromova.calculator;

public class Addition implements BinaryOperations{

    @Override
    public double findResultFor(double x, double y) {
        return x + y;
    }
}
