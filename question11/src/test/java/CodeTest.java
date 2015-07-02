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

        assertThat(results)
            .hasSize(2 * 1)
            .containsExactly("ab", "ba");
    }

    @Test
    public void more_chars() {
        List<String> results = permutations.of("hello");

        assertThat(results)
            .hasSize(5 * 4 * 3 * 2 * 1)
            .containsExactly("hello", "helol", "hello", "helol", "heoll", "heoll", "hlelo", "hleol", "hlleo", "hlloe", "hloel", "hlole", "hlelo", "hleol", "hlleo", "hlloe", "hloel", "hlole", "hoell", "hoell", "holel", "holle", "holel", "holle", "ehllo", "ehlol", "ehllo", "ehlol", "eholl", "eholl", "elhlo", "elhol", "ellho", "elloh", "elohl", "elolh", "elhlo", "elhol", "ellho", "elloh", "elohl", "elolh", "eohll", "eohll", "eolhl", "eollh", "eolhl", "eollh", "lhelo", "lheol", "lhleo", "lhloe", "lhoel", "lhole", "lehlo", "lehol", "lelho", "leloh", "leohl", "leolh", "llheo", "llhoe", "lleho", "lleoh", "llohe", "lloeh", "lohel", "lohle", "loehl", "loelh", "lolhe", "loleh", "lhelo", "lheol", "lhleo", "lhloe", "lhoel", "lhole", "lehlo", "lehol", "lelho", "leloh", "leohl", "leolh", "llheo", "llhoe", "lleho", "lleoh", "llohe", "lloeh", "lohel", "lohle", "loehl", "loelh", "lolhe", "loleh", "ohell", "ohell", "ohlel", "ohlle", "ohlel", "ohlle", "oehll", "oehll", "oelhl", "oellh", "oelhl", "oellh", "olhel", "olhle", "olehl", "olelh", "ollhe", "olleh", "olhel", "olhle", "olehl", "olelh", "ollhe", "olleh");
    }
}
