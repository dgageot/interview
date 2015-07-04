import java.util.Deque;
import java.util.LinkedList;

public class Code {
    private final String expression;

    public Code(String expression) {
        this.expression = expression;
    }

    public boolean checkParentheses() {
        if (expression.length() % 2 != 0) {
            return false;
        }

        Deque<Character> parentheses = new LinkedList<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    parentheses.add(c);
                    break;
                case ')':
                    if (parentheses.removeLast() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (parentheses.removeLast() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (parentheses.removeLast() != '{') {
                        return false;
                    }
                    break;
            }
        }

        return true;
    }
}
