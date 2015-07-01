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

    @Test
    public void removeAtEnd() {
        Node head = new Node(10, new Node(9, new Node(5)));

        Node updated = Node.remove(head, 5);

        assertThat(Node.toList(updated)).containsExactly(10, 9);
    }

    @Test
    public void single_matching_value() {
        Node head = new Node(5);

        Node updated = Node.remove(head, 5);

        assertThat(Node.toList(updated)).isEmpty();
    }

    @Test
    public void multiple_matching_value() {
        Node head = new Node(5, new Node(5, new Node(5, new Node(4))));

        Node updated = Node.remove(head, 5);

        assertThat(Node.toList(updated)).containsExactly(4);
    }

    @Test
    public void alternate_values() {
        Node head = new Node(5, new Node(10, new Node(5, new Node(5, new Node(4)))));

        Node updated = Node.remove(head, 5);

        assertThat(Node.toList(updated)).containsExactly(10, 4);
    }
}
