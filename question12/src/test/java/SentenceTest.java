import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SentenceTest {
    private static String reverseWords(String text) {
        return new Sentence(text).reverseWords();
    }

    @Test
    public void single_word() {
        assertThat(reverseWords("hello")).isEqualTo("olleh");
    }

    @Test
    public void trim() {
        assertThat(reverseWords(" boy ")).isEqualTo("yob");
    }

    @Test
    public void two_words() {
        assertThat(reverseWords("hello world")).isEqualTo("olleh dlrow");
        assertThat(reverseWords("hello  world")).isEqualTo("olleh dlrow");
        assertThat(reverseWords(" hello  world ")).isEqualTo("olleh dlrow");
    }
}
