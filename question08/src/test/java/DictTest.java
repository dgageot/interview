import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DictTest {
    Dict dict = Dict.read();

    @Test
    public void find_word() {
        assertThat(dict.test("hello")).isTrue();
        assertThat(dict.test("bonjour")).isFalse();
    }

    @Test
    public void find_permutations() {
        assertThat(dict.permutations("a")).containsOnly("ha", "pa", "ah", "am", "an", "as", "at");
        assertThat(dict.permutations("hello")).containsOnly("hell", "cello", "hallo", "hullo", "hells");
        assertThat(dict.permutations("cat")).containsOnly("at", "bat", "eat", "fat", "hat", "mat", "oat", "pat", "rat", "sat", "tat", "vat", "cot", "cut", "cab", "cad", "cam", "can", "cap", "car", "caw", "scat", "chat", "coat", "cant", "cart", "cast", "cats");
    }
}
