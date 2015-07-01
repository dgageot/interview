import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPairSum {
    PairSum pairSum = new PairSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    @Test
    public void test_sum() {
        List<int[]> pairs = pairSum.get(3);

        assertThat(pairs).containsOnly(new int[]{1, 3});
    }

    @Test
    public void test_two_solutions() {
        List<int[]> pairs = pairSum.get(5);

        assertThat(pairs).containsOnly(new int[]{1, 4}, new int[]{2, 3});
    }
}
