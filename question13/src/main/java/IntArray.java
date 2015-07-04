public class IntArray {
    private final int[] values;

    public IntArray(int... values) {
        this.values = values;
    }

    public int median(int nbReceived) {
        if (nbReceived == 0) {
            return values[0];
        }
        if (nbReceived == 1) {
            return (values[0] + values[1]) / 2;
        }
        if (nbReceived == 2) {
            return values[0];
        }
        return -1;
    }
}
