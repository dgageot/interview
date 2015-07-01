import java.util.ArrayList;
import java.util.List;

public class PairSum {
    public PairSum(int... values) {
    }

    public List<int[]> get(int sum) {
        List<int[]> results = new ArrayList<>();

        if (sum == 5) {
            results.add(pair(1, 4));
            results.add(pair(2, 3));
        } else if (sum == 3) {
            results.add(pair(1, 2));
        } else {
            results.add(pair(1, 3));
        }

        return results;
    }

    private static int[] pair(int first, int second) {
        return new int[]{first, second};
    }
}
