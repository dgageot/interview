import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CodeTest {
    @Test
    public void empty() {
        boolean valid = new Code("").checkParentheses();

        assertThat(valid).isTrue();
    }
}
