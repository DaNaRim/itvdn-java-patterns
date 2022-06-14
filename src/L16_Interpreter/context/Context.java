package L16_Interpreter.context;

import L16_Interpreter.expressions.*;

public class Context {

    public Expression evaluateExpression(String expression) {
        String trimExp = validateExpression(expression);

        if (trimExp.matches("-?[0-9.]+")) return new NumberExpression(Double.parseDouble(trimExp));

        for (int position = trimExp.length() - 1; position >= 0; position--) {
            if (Character.isDigit(trimExp.charAt(position)) || trimExp.charAt(position) == '.') {
                continue;
            }

            switch (trimExp.charAt(position)) {
                case ')' -> {
                    int bracketsToSkip = trimExp.endsWith(")") ? 0 : -1;
                    for (int i = trimExp.length() - 2; i > 0; i--) {
                        if (trimExp.charAt(i) == ')') bracketsToSkip++;
                        if (trimExp.charAt(i) == '(' && bracketsToSkip == 0) {
                            position = i;
                            break;
                        }
                        if (trimExp.charAt(i) == '(') bracketsToSkip--;
                    }
                }
                case '-' -> {
                    Expression left = trimExp.substring(0, position).isEmpty()
                            ? new NumberExpression(0)
                            : evaluateExpression(trimExp.substring(0, position));

                    Expression right = evaluateExpression(trimExp.substring(position + 1));
                    return new MinusExpression(left, right);
                }
                case '+' -> {
                    Expression left = evaluateExpression(trimExp.substring(0, position));
                    Expression right = evaluateExpression(trimExp.substring(position + 1));
                    return new PlusExpression(left, right);
                }
                case '*' -> {
                    boolean notLastOperator = false;
                    for (int i = 0; i < position - 1; i++) {
                        if (!Character.isDigit(trimExp.charAt(i)) && trimExp.charAt(i) != '/') notLastOperator = true;
                    }
                    if (!trimExp.startsWith("(") && notLastOperator) continue;

                    Expression left = evaluateExpression(trimExp.substring(0, position));
                    Expression right = evaluateExpression(trimExp.substring(position + 1));
                    return new MultiplyExpression(left, right);
                }
                case '/' -> {
                    boolean notLastOperator = false;
                    for (int i = 0; i < position - 1; i++) {
                        if (!Character.isDigit(trimExp.charAt(i)) && trimExp.charAt(i) != '*') notLastOperator = true;
                    }
                    if (!trimExp.startsWith("(") && notLastOperator) continue;

                    Expression left = evaluateExpression(trimExp.substring(0, position));
                    Expression right = evaluateExpression(trimExp.substring(position + 1));
                    return new DivisionExpression(left, right);
                }
                default -> throw new RuntimeException("Unsupported operand: '%s'".formatted(trimExp.charAt(position)));
            }
        }
        throw new RuntimeException("Something went wrong");
    }

    private String validateExpression(String expression) {
        if (expression == null
                || expression.isBlank()
                || !expression.matches("[-+*/:()0-9._\\s]+")) {
            throw new RuntimeException("Invalid Expression");
        }

        long openBracketCount = expression.chars().filter(ch -> ch == '(').count();
        long closeBracketCount = expression.chars().filter(ch -> ch == ')').count();

        if (openBracketCount != closeBracketCount) {
            throw new RuntimeException("Inconsistency of opening and closing brackets");
        }
        if (expression.startsWith("+")) {
            throw new RuntimeException("Can`t process unary operations like '+1'");
        }
        if (expression.startsWith("*") || expression.startsWith("/")) {
            throw new RuntimeException("Can`t process operations like '/1'");
        }
        if (expression.endsWith("+")
                || expression.endsWith("-")
                || expression.endsWith("*")
                || expression.endsWith("/")) {
            throw new RuntimeException("There should not be two consecutive operators and operators like '1+");
        }

        String trimExp = expression.replaceAll("\\s+", "")
                .replaceAll(",", ".")
                .replaceAll(":", "/")
                .replaceAll("_", "");

        while (isBracketsExternal(trimExp)) {
            trimExp = trimExp.substring(1).substring(0, trimExp.length() - 2);
        }
        if (trimExp.isEmpty()) throw new RuntimeException("There should not be empty brackets");
        return trimExp;
    }

    private boolean isBracketsExternal(String expression) {
        if (!expression.contains("(") && !expression.contains(")")) return false;

        int countOpenBrackets = 0;
        for (int i = 0; i < expression.length() - 1; i++) {
            if (i != 0 && countOpenBrackets == 0) return false;
            if (expression.charAt(i) == '(') countOpenBrackets++;
            if (expression.charAt(i) == ')') countOpenBrackets--;
        }
        return true;
    }
}
