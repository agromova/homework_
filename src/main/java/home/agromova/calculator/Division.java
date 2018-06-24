package home.agromova.calculator;

public class Division implements BinaryOperations {

    @Override
    public double findResultFor(double x, double y) {
        return x / y;
    }
}
