import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NonRepeatedTest {
    @Test
    public void test() {
        char nonRepeated = new NonRepeated().find("a");

        assertThat(nonRepeated).isEqualTo('a');
    }
}
