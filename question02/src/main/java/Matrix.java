public class Matrix {
    private final int[][] values;

    public Matrix(int[][] values) {
        this.values = values;
    }

    public long sum(int x1, int y1, int x2, int y2) {
        long sum = 0L;

        for (int y = y1; y <= y2; y++) {
            for (int x = x1; x <= x2; x++) {
                sum += values[y][x];
            }
        }

        return sum;
    }
}
