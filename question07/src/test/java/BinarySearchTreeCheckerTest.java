import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTreeCheckerTest {
    @Test
    public void valid() {
        Node tree = new Node(3, new Node(2, new Node(1, null, null), new Node(4, null, null)), new Node(5, null, null));

        boolean valid = new BinarySearchTreeChecker().isValid(tree);

        assertThat(valid).isFalse();
    }
}
