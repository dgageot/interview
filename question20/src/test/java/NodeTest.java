import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NodeTest {
  @Test
  public void single_node() {
    Node root = new Node(1);

    assertThat(root.levelOrderPrint()).isEqualTo("1\n");
  }
}
