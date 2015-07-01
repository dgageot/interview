import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DetectorTest {
    @Test
    public void sample() {
        Detector detector = new Detector();

        boolean isShuffle = detector.isShuffle("abc", "def", "dabecf");

        assertThat(isShuffle).isTrue();
    }

    @Test
    public void wrong_size() {
        Detector detector = new Detector();

        boolean isShuffle = detector.isShuffle("a", "b", "");

        assertThat(isShuffle).isFalse();
    }
}
