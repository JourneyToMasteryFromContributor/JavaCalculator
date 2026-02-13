public class Calculator {
    private Double firstNumber;
    private String operator; // For switch statement
    private Double secondNumber;

    public Calculator(Double firstNumber, String operator, Double secondNumber) {
        this.firstNumber = firstNumber;
        this.operator = operator;
        this.secondNumber = secondNumber;
    }

    public double calculate() {
        return switch (operator) {
            case "+" -> firstNumber + secondNumber; // If the case is _ then ->
            case "-" -> firstNumber - secondNumber;
            case "/" -> firstNumber / secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "**" -> Math.pow(firstNumber, secondNumber);
            default -> throw new IllegalArgumentException("Unknown (or most likely unadded) operator: \"" + operator + "\"");
        };
    }
}

// Originally was going to do this but remembered about switch statements so atleast im not as bad as yandere dev
//    public double addition() {
//        return firstNumber + secondNumber;  // Learnt that you don't need to assign this to a variable
//    }
//
//    public double subtraction() {
//        return firstNumber - secondNumber;
//    }
//
//    public double multiply() {
//        return firstNumber * secondNumber;
//    }
//
//    public double cube() {
//        ret
//    }
//}
