import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MatrixTest {
    @Test
    public void sum_area() {
        Matrix matrix = new Matrix(new int[][]{
                {70, 37, 23, 57, 22, 90, 99},
                {47, 65, 33, 1, 42, 6, 99},
                {36, 62, 50, 21, 22, 90, 99},
                {36, 62, 50, 21, 22, 91, 99},
                {7, 73, 23, 57, 23, 4, 5}
        });

        long sum = matrix.sum(4, 1, 5, 3);

        assertThat(sum).isEqualTo(42 + 6 + 22 + 90 + 22 + 91).isEqualTo(273);
    }

    @Test
    public void sum_single_cell() {
        Matrix matrix = new Matrix(new int[][]{
                {70, 37, 23, 57, 22, 90, 99},
                {47, 65, 33, 1, 42, 6, 99},
                {36, 62, 50, 21, 22, 90, 99},
                {36, 62, 50, 21, 22, 91, 99},
                {7, 73, 23, 57, 23, 4, 5}
        });

        long sum = matrix.sum(4, 1, 4, 1);

        assertThat(sum).isEqualTo(42);
    }
}
