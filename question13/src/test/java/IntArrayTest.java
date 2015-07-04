import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntArrayTest {
    @Test
    public void single() {
        IntArray array = new IntArray(1);

        int median = array.median(0);

        assertThat(median).isEqualTo(1);
    }
}
