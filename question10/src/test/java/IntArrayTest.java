import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntArrayTest {
    @Test
    public void kLargest() {
        IntArray intArray = new IntArray(3, 1, 2, 1, 4);

        int largest = intArray.kLargest(3);

        assertThat(largest).isEqualTo(2);
    }
}
