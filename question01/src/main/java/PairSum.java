import java.util.ArrayList;
import java.util.List;

public class PairSum {
    private final int[] values;

    public PairSum(int... values) {
        this.values = values;
    }

    public List<int[]> get(int sum) {
        List<int[]> results = new ArrayList<>();

        for (int i = 0; i < values.length; i++) {
            int first = values[i];

            for (int j = i + 1; j < values.length; j++) {
                int second = values[j];

                if (first + second == sum) {
                    results.add(pair(first, second));
                }
            }
        }

        return results;
    }

    private static int[] pair(int first, int second) {
        return new int[]{first, second};
    }
}
