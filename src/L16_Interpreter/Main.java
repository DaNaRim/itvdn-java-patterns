package L16_Interpreter;

import L16_Interpreter.context.Context;
import L16_Interpreter.expressions.Expression;

public class Main {

    private static final Context context = new Context();

    public static void main(String[] args) {
        String stringExpression = "1 + 3 * 2 + (70) / 7";
        Expression expression = context.evaluateExpression(stringExpression);
        System.out.println(stringExpression + " = " + expression.interpret());

        test("2", 2);
        test("-3", -3);
        test("004", 4);
        test("0.1 + 0.3", 0.4);
        test("0.1 + (-0.3)", -0.2);
        test("-(3 + 5)", -8);
        test("1 + 1", 2);
        test("(((1 + 1)))", 2);
        test(" 2-1 +     2 ", 3);
        test("(1+(4+5+2)-3)+(6+8)", 23);
        test("(1+(4+0005+2)-03)+(6+8)", 23);
        test("3 + 8234 / 8234", 4);
        test("3 + 8234 : 8234", 4);
        test("805 * 712 + (245 * 10 - 2300) * 834 - 501 * 604", 395_656);
        test("701 * 901 - 83200 / 208 + (20_000 - 18_904) * 99", 739_705);
    }

    private static void test(String expression, double result) {
        System.out.println(Math.abs(context.evaluateExpression(expression).interpret() - result) < 0.00000001);
    }
}
