import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramsTest {
    Anagrams anagrams = new Anagrams();

    @Test
    public void single_character() {
        assertThat(anagrams.check("a", "a")).isTrue();
        assertThat(anagrams.check("ab", "ab")).isTrue();
        assertThat(anagrams.check("a", "b")).isFalse();
    }

    @Test
    public void reversed() {
        assertThat(anagrams.check("ab", "ba")).isTrue();
    }
}
