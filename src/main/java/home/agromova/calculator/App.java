package home.agromova.calculator;

public class App {
    public static void main(String[] args) {

        App calculation = new App();
        System.out.println(calculation.calculate(9,3,"^"));

    }

    public double calculate(double x, double y, String operator) {

        BinaryOperations operation = getOperation(operator);
        if (operator == null) {
            System.out.println("Неизвестный оператор " + operator);
            return Double.NaN;
        }

        return operation.findResultFor(x, y);

    }

    private BinaryOperations getOperation(String operator) {
        if ("+".equals(operator)) {
            return new Addition();
        } else if ("-".equals(operator)) {
            return new Subtraction();
        } else if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("/".equals(operator)) {
            return new Division();
        } else if ("^".equals(operator)) {
            return new RaisingToPower();
        } else if ("log".equals(operator)) {
            return new LogBase();
        } else if ("sqrt".equals(operator)) {
            return new Root();
        }

        return null;
    }


}


