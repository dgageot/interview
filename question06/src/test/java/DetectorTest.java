import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DetectorTest {
    Detector detector = new Detector();

    @Test
    public void sample() {
        boolean isShuffle = detector.isShuffle("abc", "def", "dabecf");

        assertThat(isShuffle).isTrue();
    }

    @Test
    public void wrong_size() {
        boolean isShuffle = detector.isShuffle("a", "b", "");

        assertThat(isShuffle).isFalse();
    }

    @Test
    public void empty() {
        boolean isShuffle = detector.isShuffle("", "", "");

        assertThat(isShuffle).isTrue();
    }
}
