import java.util.Arrays;

public class IntArray {
    private final int[] values;

    public IntArray(int... values) {
        this.values = values;
    }

    public int median(int nbReceived) {
        int[] sorted = sort(values, nbReceived);

        if (nbReceived % 2 == 0) {
            return (sorted[nbReceived / 2 - 1] + sorted[nbReceived / 2]) / 2;
        } else {
            return sorted[(nbReceived - 1) / 2];
        }
    }

    private static int[] sort(int[] values, int count) {
        int[] copy = Arrays.copyOfRange(values, 0, count);
        Arrays.sort(copy);
        return copy;
    }
}
