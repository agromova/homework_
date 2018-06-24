package home.agromova.calculator;

public class LogBase implements BinaryOperations{

    @Override
    public double findResultFor(double x, double y) {
        return Math.log(y) / Math.log(x);
    }
}
