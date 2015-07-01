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

    @Test
    public void emptyLeft() {
        boolean isShuffle = detector.isShuffle("", "abc", "abc");

        assertThat(isShuffle).isTrue();
    }

    @Test
    public void emptyRight() {
        boolean isShuffle = detector.isShuffle("abc", "", "abc");

        assertThat(isShuffle).isTrue();
    }

    @Test
    public void long_sample() {
        boolean isShuffle = detector.isShuffle(
            "aaaaaaaaaaaaaaaaaaaaaaaaab",
            "aaaaaaaaaaaaaaaaaaaaaaaaac",
            "aaaaaaaaaaaaaaaaaaaaaaaaaaacaaaaaaaaaaaaaaaaaaaaaaab");

        assertThat(isShuffle).isTrue();
    }

    @Test
    public void very_long_sample() {
        boolean isShuffle = detector.isShuffle(
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac",
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab");

        assertThat(isShuffle).isTrue();
    }
}
