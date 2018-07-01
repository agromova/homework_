package home.agromova.calculator;


public enum Operations {
    DIVISION(new Division()),
    MULTIPLICATION(new Multiplication()),
    SUBTRACTION(new Subtraction()),
    ADDITION(new Addition()),
    ROOT(new Root()),
    LOGBASE(new LogBase()),
    RAISINGTOPOWER(new RaisingToPower());

    private BinaryOperations operation;


    Operations(BinaryOperations operation) {
        this.operation = operation;
    }

    public static BinaryOperations getOperation(String operator) {

        if ("+".equals(operator)) {
            return ADDITION.operation;
        } else if ("-".equals(operator)) {
            return SUBTRACTION.operation;
        } else if ("*".equals(operator)) {
            return MULTIPLICATION.operation;
        } else if ("/".equals(operator)) {
            return DIVISION.operation;
        } else if ("^".equals(operator)) {
            return RAISINGTOPOWER.operation;
        } else if ("log".equals(operator)) {
            return LOGBASE.operation;
        } else if ("sqrt".equals(operator)) {
            return ROOT.operation;
        }

        return null;
    }
}
