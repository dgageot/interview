public class IntArray {
    private final int[] values;

    public IntArray(int... values) {
        this.values = values;
    }

    public int findMissing(int... shuffled) {
        long sumValues = sum(values);
        long sumShuffled = sum(shuffled);

        return (int) (sumValues - sumShuffled);
    }

    private long sum(int[] values) {
        long sum = 0;

        for (int value : values) {
            sum += value;
        }

        return sum;
    }
}
