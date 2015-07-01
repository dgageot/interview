import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntArrayTest {
    @Test
    public void test() {
        IntArray intArray = new IntArray(1, 4, 5, -500, 7, 99, 5, 9, -1000, 100, 3);

        long largestContinuousSum = intArray.largestContinuousSum();

        assertThat(largestContinuousSum).isEqualTo(120);
    }

    @Test
    public void test_simple() {
        IntArray intArray = new IntArray(100, -1000, 200);

        long largestContinuousSum = intArray.largestContinuousSum();

        assertThat(largestContinuousSum).isEqualTo(200);
    }

    @Test
    public void allNegative() {
        IntArray intArray = new IntArray(-6, -2, -1);

        long largestContinuousSum = intArray.largestContinuousSum();

        assertThat(largestContinuousSum).isEqualTo(-1);
    }
}
