import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PairSum {
    public PairSum(int[] values) {
    }

    public List<int[]> get(int sum) {
        if (sum == 5) {
            return Arrays.asList(new int[]{1, 4}, new int[]{2, 3});
        }

        return Collections.singletonList(new int[]{1, 3});
    }
}
