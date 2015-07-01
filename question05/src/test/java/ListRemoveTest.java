import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ListRemoveTest {
    @Test
    public void empty() {
        Node head = null;

        Node updated = Node.remove(head, 5);

        assertThat(Node.toList(updated)).isEmpty();
    }

    @Test
    public void identity() {
        Node head = new Node(10);

        Node updated = Node.remove(head, 5);

        assertThat(Node.toList(updated)).containsExactly(10);
    }
}
