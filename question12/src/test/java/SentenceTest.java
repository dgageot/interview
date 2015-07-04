import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SentenceTest {
    @Test
    public void single_word() {
        Sentence sentence = new Sentence("hello");

        String reversed = sentence.reverseWords();

        assertThat(reversed).isEqualTo("olleh");
    }

    @Test
    public void trim() {
        Sentence sentence = new Sentence(" boy ");

        String reversed = sentence.reverseWords();

        assertThat(reversed).isEqualTo("yob");
    }
}
