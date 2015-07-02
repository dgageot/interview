import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CodeTest {
    Permutations permutations = new Permutations();

    @Test
    public void single_char() {
        List<String> results = permutations.of("a");

        assertThat(results).containsExactly("a");
    }

    @Test
    public void two_chars() {
        List<String> results = permutations.of("ab");

        assertThat(results).containsExactly("ab", "ba");
    }
}
