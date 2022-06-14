package L16_Interpreter.expressions;

public class DivisionExpression implements Expression {

    private final Expression left;
    private final Expression right;

    public DivisionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double interpret() {
        if (right.interpret() == 0) {
            throw new RuntimeException("Division by zero");
        }

        return left.interpret() / right.interpret();
    }
}
