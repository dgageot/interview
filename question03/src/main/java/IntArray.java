public class IntArray {
    private final int[] values;

    public IntArray(int... values) {
        this.values = values;
    }

    public long largestContinuousSum() {
        long max = Long.MIN_VALUE;

        int current = 0;
        for (int value : values) {
            current += value;

            max = Math.max(max, current);
            current = Math.max(current, 0);
        }

        return max;
    }
}
