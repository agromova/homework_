package home.agromova.calculator;


public class App {


    public static void main(String[] args) {

        App calculation = new App();
        System.out.println(calculation.calculate(9,3,"+"));

    }

    public double calculate(double x, double y, String operator) {

        BinaryOperations operation = Operations.getOperation(operator);
        if (operator == null) {
            System.out.println("Неизвестный оператор " + operator);
            return Double.NaN;
        }

        return operation.findResultFor(x, y);
    }

}


