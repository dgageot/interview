import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NonRepeatedTest {
    NonRepeated nonRepeated = new NonRepeated();

    @Test
    public void singleCharacter() {
        assertThat(nonRepeated.find("a")).isEqualTo('a');
        assertThat(nonRepeated.find("b")).isEqualTo('b');
    }

    @Test
    public void nonRepeating() {
        assertThat(nonRepeated.find("aab")).isEqualTo('b');
        assertThat(nonRepeated.find("aacbb")).isEqualTo('c');
    }

    @Test
    public void notFound() {
        assertThat(nonRepeated.find("aa")).isEqualTo('?');
    }
}
