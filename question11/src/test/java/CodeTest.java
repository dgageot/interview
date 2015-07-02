import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CodeTest {
    @Test
    public void single_char() {
        List<String> permutation = new Permutations().of("a");

        assertThat(permutation).containsExactly("a");
    }

    @Test
    public void two_chars() {
        List<String> permutation = new Permutations().of("ab");

        assertThat(permutation).containsExactly("ab", "ba");
    }
}
