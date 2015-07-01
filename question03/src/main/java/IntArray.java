public class IntArray {
    private final int[] values;

    public IntArray(int... values) {
        this.values = values;
    }

    public long largestContinuousSum() {
        long max = Long.MIN_VALUE;

        for (int i = 0; i < values.length; i++) {
            int current = 0;
            for (int j = i; j < values.length; j++) {
                current += current + values[j];
                if (current > max) {
                    max = current;
                }

                if (current < 0) {
                    current = 0;
                }
            }
        }

        return max;
    }
}
