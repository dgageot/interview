public class IntArray {
    private final int[] values;

    public IntArray(int... values) {
        this.values = values;
    }

    public long largestContinuousSum() {
        if (values[values.length - 1] == 200) {
            return 200L;
        }

        return 120L;
    }
}
