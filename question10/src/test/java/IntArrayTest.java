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

    @Test
    public void any_k_largest() {
        assertThat(intArray.kLargest(1)).isEqualTo(1);
        assertThat(intArray.kLargest(2)).isEqualTo(1);
        assertThat(intArray.kLargest(3)).isEqualTo(2);
        assertThat(intArray.kLargest(4)).isEqualTo(3);
        assertThat(intArray.kLargest(5)).isEqualTo(4);
    }
}
