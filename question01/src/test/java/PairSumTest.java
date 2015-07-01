import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PairSumTest {
    PairSum pairSum = new PairSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    @Test
    public void one_solution() {
        List<int[]> pairs = pairSum.get(3);

        assertThat(pairs).containsOnly(new int[]{1, 2});
    }

    @Test
    public void two_solutions() {
        List<int[]> pairs = pairSum.get(5);

        assertThat(pairs).containsOnly(new int[]{1, 4}, new int[]{2, 3});
    }

    @Test
    public void use_distinct_values() {
        List<int[]> pairs = pairSum.get(4);

        assertThat(pairs).containsOnly(new int[]{1, 3});
    }

    @Test
    public void negative_values() {
        PairSum pairSum = new PairSum(-1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<int[]> pairs = pairSum.get(4);

        assertThat(pairs).containsOnly(new int[]{-1, 5});
    }

    @Test
    public void unsorted_array() {
        PairSum pairSum = new PairSum(10, 3, -1, -2, 4, 5, 6, 7, 8, 9);

        List<int[]> pairs = pairSum.get(4);

        assertThat(pairs).containsOnly(new int[]{-1, 5}, new int[]{-2, 6});
    }

    @Test
    public void duplicate_values() {
        PairSum pairSum = new PairSum(10, 3, -1, -2, 4, 4, 5, 6, 7, 8, 9);

        List<int[]> pairs = pairSum.get(8);

        assertThat(pairs).containsOnly(new int[]{4, 4}, new int[]{3, 5}, new int[]{-1, 9}, new int[]{10, -2});
    }
}
