public class IntArray {
    private final int[] values;

    public IntArray(int... values) {
        this.values = values;
    }

    public int findMissing(int... shuffled) {
        int missing = 0;

        for (int value : values) {
            missing = missing ^ value;
        }
        for (int value : shuffled) {
            missing = missing ^ value;
        }

        return missing;
    }
}
