import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntArrayTest {
    @Test
    public void find_missing() {
        IntArray intArray = new IntArray(4, 1, 0, 2, 9, 6, 8, 7, 5, 3);

        int missing = intArray.findMissing(6, 4, 7, 2, 1, 0, 8, 3, 9);

        assertThat(missing).isEqualTo(5);
    }

    @Test
    public void find_another_missing() {
        IntArray intArray = new IntArray(4, 1, 0, 2, 9, 6, 8, 7, 5, 3);

        int missing = intArray.findMissing(6, 4, 7, 2, 1, 0, 8, 3, 5);

        assertThat(missing).isEqualTo(9);
    }
}
