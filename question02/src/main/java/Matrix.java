public class Matrix {
    private final long[][] sums;

    public Matrix(int[][] values) {
        this.sums = preCalcSums(values);
    }

    private static long[][] preCalcSums(int[][] values) {
        long[][] sums = new long[values.length][];
        for (int y = 0; y < values.length; y++) {
            sums[y] = new long[values[y].length];
        }

        for (int y = 0; y < values.length; y++) {
            for (int x = 0; x < sums[y].length; x++) {
                sums[y][x] = sum(values, 0, 0, x, y);
            }
        }

        return sums;
    }

    public static long sum(int[][] values, int x1, int y1, int x2, int y2) {
        long sum = 0L;

        for (int y = y1; y <= y2; y++) {
            for (int x = x1; x <= x2; x++) {
                sum += values[y][x];
            }
        }

        return sum;
    }

    public long sum(int x1, int y1, int x2, int y2) {
        return sums[y2][x2]
                - sums[y1 - 1][x2]
                - sums[y2][x1 - 1]
                + sums[y1 - 1][x1 - 1];
    }
}
