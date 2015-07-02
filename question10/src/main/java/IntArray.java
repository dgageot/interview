import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntArray {
    private final int[] values;

    public IntArray(int... values) {
        this.values = values;
    }

    public int kLargest(int k) {
        Random random = new Random();
        int previous = 0;

        List<Integer> all = new ArrayList<>();
        for (int value : values) {
            all.add(value);
        }

        while (!all.isEmpty()) {
            int pivot = all.get(random.nextInt(all.size()));

            List<Integer> smaller = new ArrayList<>();
            List<Integer> larger = new ArrayList<>();
            boolean onlyPivot = true;

            for (int value : all) {
                if (value < pivot) {
                    smaller.add(value);
                } else {
                    larger.add(value);
                }
                if (value != pivot) {
                    onlyPivot = false;
                }
            }

            if (onlyPivot) {
                return pivot;
            }

            if ((previous + smaller.size()) == (k - 1)) {
                return pivot;
            } else if ((previous + smaller.size()) < (k - 1)) {
                all = larger;
                previous += smaller.size();
            } else {
                all = smaller;
            }
        }

        return -1;
    }
}
