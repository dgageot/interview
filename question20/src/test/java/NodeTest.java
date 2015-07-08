import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NodeTest {
  @Test
  public void single_node() {
    assertThat(new Node(1).levelOrderPrint()).isEqualTo("1\n");
    assertThat(new Node(2).levelOrderPrint()).isEqualTo("2\n");
  }

  @Test
  public void two_levels() {
    assertThat(new Node(1, new Node(2), new Node(3)).levelOrderPrint()).isEqualTo("1\n2 3\n");
    assertThat(new Node(1, new Node(4), new Node(5)).levelOrderPrint()).isEqualTo("1\n4 5\n");
  }

  @Test
  public void print_level_order() {
    Node root = new Node(1,
      new Node(2,
        new Node(4), null),
      new Node(3,
        new Node(5),
        new Node(6))
    );

    assertThat(root.levelOrderPrint()).isEqualTo("1\n2 3\n4 5 6\n");
  }
}
