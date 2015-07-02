import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntArrayTest {
    IntArray intArray = new IntArray(3, 1, 2, 1, 4);

    @Test
    public void kLargest() {
        int largest = intArray.kLargest(3);

        assertThat(largest).isEqualTo(2);
    }

    @Test
    public void last() {
        int largest = intArray.kLargest(5);

        assertThat(largest).isEqualTo(4);
    }
}
