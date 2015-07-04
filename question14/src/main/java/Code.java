public class Code {
    private final String expression;

    public Code(String expression) {
        this.expression = expression;
    }

    public boolean checkParentheses() {
        if (expression.isEmpty()) {
            return true;
        }
        if (expression.length() == 2) {
            return true;
        }
        return false;
    }
}
