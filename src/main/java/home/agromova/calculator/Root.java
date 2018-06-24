package home.agromova.calculator;

// корень N-степени из числа A можно преобразовать в A в степени 1/N Math.pow(A, 1.0/N)

public class Root implements BinaryOperations{
    @Override
    public double findResultFor(double x, double y) {
        return Math.pow(x, 1.0/y);
    }
}
