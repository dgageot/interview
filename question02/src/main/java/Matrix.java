public class Matrix {
    private final long[][] sums;

    public Matrix(int[][] values) {
        this.sums = preCalcSums(values);
    }

    public long sum(int x1, int y1, int x2, int y2) {
        return sums[y2][x2]
                - sums[y1 - 1][x2]
                - sums[y2][x1 - 1]
                + sums[y1 - 1][x1 - 1];
    }

    private static long[][] preCalcSums(int[][] values) {
        long[][] sums = new long[values.length][];
        for (int y = 0; y < values.length; y++) {
            sums[y] = new long[values[y].length];

            long current = 0;
            for (int x = 0; x < sums[y].length; x++) {
                current += values[y][x];

                sums[y][x] = current;
                if (y > 0) {
                    sums[y][x] += sums[y - 1][x];
                }
            }
        }

        return sums;
    }
}
