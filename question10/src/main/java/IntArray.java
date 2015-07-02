import java.util.Arrays;

public class IntArray {
    private final int[] values;

    public IntArray(int... values) {
        this.values = values;
    }

    public int kLargest(int k) {
        Arrays.sort(values);
        return values[k - 1];
    }
}
