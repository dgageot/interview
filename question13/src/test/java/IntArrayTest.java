import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntArrayTest {
    @Test
    public void simple_case() {
        IntArray array = new IntArray(4, 6, 1);

        assertThat(array.median(1)).isEqualTo(4);
        assertThat(array.median(2)).isEqualTo(5);
        assertThat(array.median(3)).isEqualTo(4);
    }

    @Test
    public void longer_stream() {
        IntArray array = new IntArray(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);

        assertThat(array.median(1)).isEqualTo(1);
        assertThat(array.median(16)).isEqualTo(8);
    }
}
