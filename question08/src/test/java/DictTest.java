import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DictTest {
    @Test
    public void find_word() {
        Dict dict = Dict.read();

        assertThat(dict.test("hello")).isTrue();
        assertThat(dict.test("bonjour")).isFalse();
    }
}
