import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPairSum {
    @Test
    public void test() {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<int[]> pairs = new PairSum(values).get(3);

        assertThat(pairs).containsExactly(new int[]{1, 3});
    }
}
