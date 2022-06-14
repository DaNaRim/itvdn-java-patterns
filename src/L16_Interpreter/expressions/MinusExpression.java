package L16_Interpreter.expressions;

public class MinusExpression implements Expression {

    private final Expression left;
    private final Expression right;

    public MinusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double interpret() {
        return left.interpret() - right.interpret();
    }
}
