public class IntArray {
    private final int[] values;

    public IntArray(int... values) {
        this.values = values;
    }

    public int findMissing(int... shuffled) {
        long sum = 0;

        for (int value : values) {
            sum += value;
        }
        for (int value : shuffled) {
            sum -= value;
        }

        return (int) sum;
    }
}
