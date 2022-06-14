package L16_Interpreter.expressions;

public class PlusExpression implements Expression {

    private final Expression left;
    private final Expression right;

    public PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double interpret() {
        return left.interpret() + right.interpret();
    }
}
