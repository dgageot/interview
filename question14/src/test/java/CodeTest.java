import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CodeTest {
    private static boolean checkParentheses(String expression) {
        return new Code(expression).checkParentheses();
    }

    @Test
    public void empty() {
        assertThat(checkParentheses("")).isTrue();
    }

    @Test
    public void invalid() {
        assertThat(checkParentheses("(")).isFalse();
    }

    @Test
    public void valid() {
        assertThat(checkParentheses("()")).isTrue();
        assertThat(checkParentheses("{}")).isTrue();
        assertThat(checkParentheses("[]")).isTrue();
    }
}
