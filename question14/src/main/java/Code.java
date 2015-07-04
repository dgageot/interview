public class Code {
    private final String expression;

    public Code(String expression) {
        this.expression = expression;
    }

    public boolean checkParentheses() {
        return expression.isEmpty();
    }
}
