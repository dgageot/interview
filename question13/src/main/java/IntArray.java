import java.util.Arrays;

public class IntArray {
    private final int[] values;

    public IntArray(int... values) {
        this.values = values;
    }

    public int median(int nbReceived) {
        int[] sorted = sort(values, nbReceived);

        if (nbReceived == 1) {
            return sorted[0];
        }
        if (nbReceived == 2) {
            return (sorted[0] + sorted[1]) / 2;
        }
        if (nbReceived == 3) {
            return sorted[1];
        }
        return -1;
    }

    private static int[] sort(int[] values, int count) {
        int[] copy = Arrays.copyOfRange(values, 0, count);
        Arrays.sort(copy);
        return copy;
    }
}
