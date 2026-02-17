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
