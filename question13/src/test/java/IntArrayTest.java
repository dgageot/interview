import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntArrayTest {
    @Test
    public void simple_case() {
        IntArray array = new IntArray(4, 6, 1);

        assertThat(array.median(0)).isEqualTo(4);
        assertThat(array.median(1)).isEqualTo(5);
        assertThat(array.median(2)).isEqualTo(6);
    }
}
