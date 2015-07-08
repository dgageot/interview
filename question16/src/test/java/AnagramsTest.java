import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramsTest {
    @Test
    public void single_character() {
        boolean areAnagrams = new Anagrams().check("a", "a");

        assertThat(areAnagrams).isTrue();
    }
}
