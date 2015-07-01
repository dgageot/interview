import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairSum {
    private final int[] values;

    public PairSum(int... values) {
        this.values = values;
    }

    public List<int[]> get(int sum) {
        List<int[]> results = new ArrayList<>();

        Set<Integer> seen = new HashSet<>();

        for (int value : values) {
            int complement = sum - value;

            if (seen.contains(complement)) {
                results.add(new int[]{complement, value});
            }

            seen.add(value);
        }

        return results;
    }
}
