package L16_Interpreter.expressions;

public class NumberExpression implements Expression {

    private final double number;

    public NumberExpression(double number) {
        this.number = number;
    }

    @Override
    public double interpret() {
        return number;
    }
}
