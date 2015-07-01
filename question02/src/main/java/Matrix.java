public class Matrix {
    private final int[][] values;

    public Matrix(int[][] values) {
        this.values = values;
    }

    public long sum(int x1, int y1, int x2, int y2) {
        return precalc_sum(0, 0, x2, y2)
                - precalc_sum(0, 0, x2, y1 - 1)
                - precalc_sum(0, 0, x1 - 1, y2)
                + precalc_sum(0, 0, x1 - 1, y1 - 1);
    }

    private long precalc_sum(int zerox, int zeroy, int x2, int y2) {
        long sum = 0L;

        for (int y = 0; y <= y2; y++) {
            for (int x = 0; x <= x2; x++) {
                sum += values[y][x];
            }
        }

        return sum;
    }
}
