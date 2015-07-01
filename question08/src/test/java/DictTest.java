import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DictTest {
    Dict dict = Dict.read();

    @Test
    public void find_word() {
        assertThat(dict.test("hello")).isTrue();
        assertThat(dict.test("bonjour")).isFalse();
    }
}
