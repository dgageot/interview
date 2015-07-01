import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DictTest {
    private static Dict dict = Dict.read();

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

    @Test
    public void simple_path() {
        List<String> path = dict.path("hello", "cello");

        assertThat(path).containsExactly("hello", "cello");
    }

    @Test
    public void unknown_path() {
        List<String> path = dict.path("hello", "helli");

        assertThat(path).isEmpty();
    }
}
